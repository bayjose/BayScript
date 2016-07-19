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
public class MethodNotFoundException extends Exception{
    public MethodNotFoundException(String name){
        System.err.println("Method:"+name+" was not found.");
    }
}
