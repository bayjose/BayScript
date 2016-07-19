/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScriptingEngine;

import Base.BayScript;

/**
 *
 * @author Bayjose
 */
public class Statement {
    public String guard;
    public String[] body;
    public EnumEnd end = EnumEnd.BREAK;
    public boolean internal = false;
    
    public Statement(String prefix, String guard, String[] body, boolean internal){
        this.guard = guard;
        this.body = body;
        this.internal = internal;
        prefix = prefix.replace(":", "");
        prefix = prefix.replace(" ", "");
        if(prefix.equals("if")){
            this.end = EnumEnd.BREAK;
        }
        if(prefix.equals("while")){
            this.end = EnumEnd.LOOP;
        }
        if(prefix.equals("for")){
            this.end = EnumEnd.LOOP;
        }
        if(BayScript.debug){
            System.out.println("--------------------------");
            System.out.println(this.end.toString()+" "+this.guard+" "+this.internal);
            for(int i=0; i<this.body.length; i++){
                System.out.println(body[i]);
            }
        }
    }
    
}
