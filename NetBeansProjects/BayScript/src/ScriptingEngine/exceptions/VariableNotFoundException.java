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
public class VariableNotFoundException extends Exception{
    public VariableNotFoundException(String name, String script, int lineNumber){
        System.err.println("Variable:"+name+" was not found:"+script+"["+lineNumber+"]");
    }
}
