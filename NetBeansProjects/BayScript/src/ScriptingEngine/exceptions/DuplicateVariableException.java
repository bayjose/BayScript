/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScriptingEngine.exceptions;

/**
 *
 * @author Bayjose
 */
public class DuplicateVariableException extends RuntimeException{
    boolean isGlobal = false;
    String name;
    String file;
    int line;
    
    public DuplicateVariableException(String name, String file, int line){
        this.name = name;
        this.file = file;
        this.line = line;
        System.err.println("Duplicate Variable:"+name+" at:"+file+"["+line+"]");
    }
    
    public DuplicateVariableException(String name, String file, int line, boolean global){
        this.name = name;
        this.file = file;
        this.line = line;
        this.isGlobal = global;
        if(!this.isGlobal){
            System.err.println("Duplicate Variable:"+name+" at:"+file+"["+line+"]");
        }else{
            System.err.println("Duplicate Global Variable:"+name+" at:"+file+"["+line+"]");
        }
    }
}
