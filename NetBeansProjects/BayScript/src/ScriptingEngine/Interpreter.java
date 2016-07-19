/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScriptingEngine;

import Base.util.Point2D;
import Base.util.StringUtils;
import components.Component;
import components.ComponentDecoder;
import java.util.LinkedList;

/**
 *
 * @author Bayjose
 */
public class Interpreter {
    private static boolean debug = false;
    
    public static String InterprateCode(String data, LinkedList<Variable> vars, Script script){
        LinkedList<Variable> allVars = (LinkedList<Variable>)vars.clone();
        for(int i=0; i<GlobalVars.vars.size(); i++){
            allVars.add(GlobalVars.vars.get(i));
        }
        
        String theAnswer;
        String beginning = "";
        String middle = "";
        String end = "";
        
        Overall:if(data.contains("(")&&data.contains(")")){
//            System.out.println("Data in:"+data);
            //Count the number of open and close brackets, and make sure that the amounts are even. 
            int numOpen = StringUtils.countMatches(data, "(");
            int numClose = StringUtils.countMatches(data, ")");
            if(numOpen!=numClose){
                System.err.println("Unballanced expression:"+data+"|"+numOpen+"/"+numClose);
                return data;
            }
            int firstOpen = data.lastIndexOf("(");
            int nextClose = data.indexOf(")", firstOpen);
            middle = data.substring(firstOpen, nextClose+1);
            beginning = data.substring(0, firstOpen);
            end       = data.substring(nextClose+1, data.length());
        
        
        //When an variable is called, ex (camX) NOT (+ x camX)
        EvaluateAVariable:{
            if(!middle.contains(" ") && !middle.contains(".")){
                String internals = middle.replaceAll("\\(", "").replaceAll("\\)", "");
                for(int i=0; i<allVars.size(); i++){
                    if(allVars.get(i).name.equals(internals)){
                        theAnswer = beginning + allVars.get(i).getData() + end;
                        if(theAnswer.contains("(")||theAnswer.contains(")")){
                            return InterprateCode(theAnswer, vars, script);
                        }else{
                            while(true){
                                if(theAnswer.startsWith(" ")){
                                    theAnswer = theAnswer.replaceFirst(" ", "");
                                }else{
                                    break;
                                }
                            }
                            data = theAnswer;
                            break Overall;
                        }

                    }
                }
            }
            //the (script).(var) variables
            if(!middle.contains(" ") && middle.contains(".")){
                String internals = middle.replaceAll("\\(", "").replaceAll("\\)", "");
                        try{
                            theAnswer = beginning + script.findVar(internals).getData() + end;
                            if (theAnswer.contains("(") || theAnswer.contains(")")) {
                                return InterprateCode(theAnswer, vars, script);
                            } else {
                                theAnswer = StringUtils.removeFrontSpacing(theAnswer);
                                data = theAnswer;
                                break Overall;
                            }
                        }catch(Exception e){
                            data = (beginning + middle + end);
                            break Overall;
                        }

            }
        }
        
        EvaluateAnExpression:{
            String internals = middle.replaceAll("\\(", "").replaceAll("\\)", "");
            String[] dataToProcess = internals.split(" ");
            if(dataToProcess.length!=3){
                cleanDataToProcess:{
                    //clean up the empty variables, sometimes "" is passed in as a var
                    String[] tempIndex = new String[3];
                    int tmpIndex = 0;
                    for(int i=0; i<dataToProcess.length; i++){
                        if(dataToProcess[i].isEmpty()){}else{
                            tempIndex[tmpIndex]=dataToProcess[i];
                            tmpIndex++;
                        }
                    }
                    dataToProcess = tempIndex;
                }
            }

            EnumAction action = EnumAction.NULL;
            for(int i = 0; i<EnumAction.values().length; i++){
                if(EnumAction.values()[i].character.equals(dataToProcess[0])){
                    action = EnumAction.values()[i];
                    break;
                }
            }

//            System.out.println(beginning + internals + end);
            
            //implicit variable detection
            for(int i=0; i<allVars.size(); i++){
                if(allVars.get(i).name.equals(dataToProcess[1])){
                    dataToProcess[1] = allVars.get(i).getData();
                }
            }
            for(int i=0; i<allVars.size(); i++){
                if(allVars.get(i).name.equals(dataToProcess[2])){
                    dataToProcess[2] = allVars.get(i).getData();
                }
            }
//            System.out.println("Var1:"+dataToProcess[1]+" Var2:"+dataToProcess[2]);
            theAnswer = beginning + (action.Action(action, dataToProcess[1], dataToProcess[2])) + end;
            if(theAnswer.contains("(")||theAnswer.contains(")")){
//                System.out.println("Answer To Revaluate:"+theAnswer);
                data = InterprateCode(theAnswer, vars, script);
            }else{
                data = theAnswer;
                break Overall;
            }
        }
        }
        
//        System.out.println("Output Answer:"+data);
        return data;
    }
    
    
    
    public static String[] cutOutData(String[] data, LinkedList<Point2D> cuts){
        String[] outData = data;
        if(debug){
            System.out.println("---------------------------");
        }
        for(int i=0; i<cuts.size(); i++){
            for(int j=(int)cuts.get(i).getX(); j<(int)cuts.get(i).getY()+1; j++){
                if(outData[j]!=null){
                    if(!outData[j].contains("force-")){
                        if(debug){
                            System.out.println("Cutting:"+outData[j]);
                        }
                        outData[j] = null;
                    }else{
                       outData[j] = outData[j].replace("}", "");
                       outData[j] = outData[j].replace("force-", "");
                    }
                }
            }
        }
        int count = 0;
        for(int i = 0; i<outData.length; i++){
            if(outData[i]!=null){
                count++;
            }
        }
        if(debug){
            System.out.println("---------------------------");
            System.out.println("Stiching back together");
        }
        String[] out = new String[count];
        count = 0;
        for(int i=0; i<outData.length; i++){
            if(outData[i] != null){
                if(debug){
                    System.out.println("Stitch:"+outData[i]);
                }
                out[count] = outData[i];
                count++;
            }
        }
        return out;
    }
    
    public static Component[] loadComponents(String path){
        String[] objectData;
        objectData = StringUtils.loadData(path);
        try {
            LinkedList<Component> components = new LinkedList<Component>();

            //loop through the data and look for "Compoent_"
            String[] componentData = new String[]{};
            //just for first time
            boolean searching = true;
            for(int i=0; i<objectData.length; i++){
                loop:{
                    if(objectData[i].startsWith("Component_")&&searching==true){
                        searching = false;
                        componentData = StringUtils.addLine(componentData, objectData[i]);
                        break loop;
                    }
                    if(searching==false){
                        if(objectData[i].startsWith("Component_")){
                            //populateing a Component LinkedList with the component data gathered from the text file,
                            //and interperated in the ComponentDecoder class
                            System.out.println("Component:"+objectData[i]);
                            components.add(ComponentDecoder.Decode(componentData));
                            componentData = new String[]{};
                            componentData = StringUtils.addLine(componentData, objectData[i]);
                        }else{
                            componentData = StringUtils.addLine(componentData, objectData[i]);
                        }
                    }
                }
            }
            //so last component is added too
//            System.out.println(componentData[0]);
            components.add(ComponentDecoder.Decode(componentData));
            
            Component[] itemComponents = new Component[components.size()];
            for(int i=0; i<itemComponents.length; i++){
                itemComponents[i] = components.get(i);
            }
            //last part of file, combine all data together to form SUPERDATA (the item)
            return itemComponents;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Component[]{};
    }
    
    public static boolean isInternal(int i, String[] data){
        int countdown = 0;
        for(int j=0; j<data.length; j++){

                if(data[j].contains("){")){
                    countdown++;
                }
                if(data[j].contains("}")){
                    countdown--;
                }
                if(i == j){
                    if(countdown <= 1){
                        return true;
                    }else{
                        return false;
                    }
                }
        }
        return false;
    }
}
