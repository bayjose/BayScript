/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import ScriptingEngine.Variable;
import java.util.LinkedList;

/**
 *
 * @author Bayjose
 */
public class CommandManager {
    protected static LinkedList<Command> commands = new LinkedList<Command>();
    
    
    public static void add(Command cmd){
        commands.add(cmd);
    }
    
    public static void call(String line){
        for(Command cmd: commands){
            if(cmd.isCalled(line)){
//                String varData = line.split(":")[1];
//                Variable[] vars = 
                cmd.event(null);
            }
        }
    }
}
