/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScriptingEngine;

import Base.Keyboard;

/**
 *
 * @author Bayjose
 */
public enum EnumAction {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/"),
    HIT("#"),
    KEY("key"),
    //Logic
    OR("|"),
    AND("&"),
    GRT(">"),
    LES("<"),
    EQL("="),
    NOT("!"),
    //unRecognised
    NULL(""),
    ;
    
    
    protected String character;
    
    public String Action(EnumAction action, String var1, String var2){
        if(action.equals(this.ADD)){
            return (Float.parseFloat(var1) + Float.parseFloat(var2))+"";
        }
        
        if(action.equals(this.SUB)){
            return (Float.parseFloat(var1) - Float.parseFloat(var2))+"";
        }
        
        if(action.equals(this.MUL)){
            return (Float.parseFloat(var1) * Float.parseFloat(var2))+"";
        }
        
        if(action.equals(this.DIV)){
            return (Float.parseFloat(var1) / Float.parseFloat(var2))+"";
        }
        
        // boolen actions
        
        if(action.equals(this.GRT)){
            return (Float.parseFloat(var1) > Float.parseFloat(var2))+"";
        }
        
        if(action.equals(this.LES)){
            return (Float.parseFloat(var1) < Float.parseFloat(var2))+"";
        }
        
        if(action.equals(this.EQL)){
            return (var1.equals(var2))+"";
        }
        
        if(action.equals(this.NOT)){
            return (!var1.equals(var2))+"";
        }
        
        if(action.equals(this.KEY)){
            return ((Keyboard.getKey(var1)+"").equals(var2))+"";
        }
        
        if(action.equals(this.AND)){ 
            var1 = var1.replaceAll(" ", "");
            var2 = var2.replaceAll(" ", "");
            return (Boolean.valueOf(var1)&&Boolean.valueOf(var2))+"";
        }
        
        if(action.equals(this.OR)){
            return (Boolean.valueOf(var1) || Boolean.valueOf(var2))+"";
        }
//        System.err.println("Unrecognised Action:"+action.name()   );
        return "";
    }
    
    EnumAction(String character){
        this.character = character;
    }
}
