/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScriptingEngine;

import java.util.LinkedList;

/**
 *
 * @author Bayjose
 */
public abstract class Variable {
    public String name;
    public final EnumVarType evt;
    private String data;
    
    public Variable(String name, String data, EnumVarType evt){
        this.evt = evt;
        this.data = data;
        this.name = name;
    }
    
    public String getData(){
        if(this.evt.equals(EnumVarType.STRING)){
            return this.data;
        }
        return this.data.replaceAll(" ", "");
    }
    
    public void setData(String newData){
        if(!this.evt.equals(EnumVarType.STRING)){
            this.data = newData.replaceAll(" ", "");
        }
        //is string
        this.data = newData;
    }
    
    public static Script findAllVars(Script script){
        //Determine the statements
        LinkedList<Variable> out = new LinkedList<Variable>();
        for(int i=0; i<script.data.length; i++){
            String data = script.data[i];
            if(data.startsWith("define-")){
            data = data.replaceAll("define-", "");
            String varName = data.split(":")[1].split("=")[0].replaceAll(" ", "");
            String varData = data.split(":")[1].split("=")[1];
                if(script.findVar(varName) == null){
                    if(data.startsWith("int")){
                        script.addVar(new VarInt(varName, varData));
                    }else if(data.startsWith("String")){
                        script.addVar(new VarString(varName, varData));
                    }else if(data.startsWith("float")){
                        script.addVar(new VarFloat(varName, varData));
                    }else if(data.startsWith("boolean")){
                        script.addVar(new VarBoolean(varName, varData));
                    }else if(data.startsWith("global")||data.startsWith("Global")){
                        
                    }else{
                        System.out.println("Type "+data+" was not recognised.");
                    }
                }
            }
        }
        return script;
    }

}
