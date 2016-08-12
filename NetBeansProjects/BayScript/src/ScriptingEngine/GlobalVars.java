/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScriptingEngine;

import Base.BayScript;
import Base.MouseInput;
import java.util.LinkedList;

/**
 *
 * @author Bayjose
 */
public class GlobalVars {
    public static LinkedList<Variable> vars = new LinkedList<Variable>();
    
    public GlobalVars(){

    }
    
    public void init(){
        //all global vars that any script can mess with
        GlobalVars.vars.add(new VarBoolean("leftClick", ""+MouseInput.IsPressed));
        GlobalVars.vars.add(new VarBoolean("rightClick", ""+MouseInput.IsPressed));
        GlobalVars.vars.add(new VarFloat("random", Math.random()+""));
        GlobalVars.vars.add(new VarInt("screenWidth", BayScript.WIDTH+""));
        GlobalVars.vars.add(new VarInt("screenHeight", BayScript.HEIGHT+""));
        GlobalVars.vars.add(new VarInt("halfScreenWidth", (BayScript.WIDTH/2)+""));
        GlobalVars.vars.add(new VarInt("halfScreenHeight", (BayScript.HEIGHT/2)+""));
        GlobalVars.vars.add(new VarInt("defaultName", "BayScript"));
        GlobalVars.vars.add(new VarInt("defaultWidth", "256"));
        GlobalVars.vars.add(new VarInt("defaultHeight", "512"));
        System.out.println("Global Vars have been Initialized.");
    }
    
    public static void tick(){
        GlobalVars.setVar("leftClick", ""+MouseInput.IsPressed);
        GlobalVars.setVar("rightClick", ""+MouseInput.IsPressed);
        GlobalVars.setVar("random", Math.random()+"");
    }
    
    private static void setVar(String name, String data){
        for(int i=0; i<GlobalVars.vars.size(); i++){
            if(name.equals(GlobalVars.vars.get(i).name.replaceAll(" ", ""))){
                GlobalVars.vars.get(i).setData(data);
                return;
            }
        }
    }
    
    public static String getVar(String name){
        for(Variable var : GlobalVars.vars){
            if(var.name.equals(name)){
                return var.getData();
            } 
        }
        return "";
    }
    
}
