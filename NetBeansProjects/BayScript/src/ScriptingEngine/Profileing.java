/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScriptingEngine;

/**
 *
 * @author Bayjose
 */
public class Profileing {
    private static int numScriptsRunning = 0;
    
    public static int getNumRunningScripts(){
        return numScriptsRunning;
    }
    
    public static void decreaseNumCount(){
        numScriptsRunning -- ;
    }
    
    public static void increaseNumCount(){
        numScriptsRunning ++ ;
    }
}
