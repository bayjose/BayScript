/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import ScriptingEngine.EnumVarType;
import ScriptingEngine.Variable;

/**
 *
 * @author Bayjose
 */
public abstract class Command {
    public final String name;
    public final int numVars;
    
    
    public final EnumVarType[] inputs;
    
    public Command(String name, EnumVarType[] inputs){
        this.name = name;
        this.inputs = inputs;
        numVars = inputs.length;
    }
    
    public final void register(){
        CommandManager.add(this);
        System.out.println("Command:\""+this.name+"\" has been registered");
    }
    
    public boolean isCalled(String line){
        if(line.startsWith(name)){
            //for commands that take no parameters
            if(numVars == 0 && !line.contains(",")){
                return true;
            }
            //for commands that take parameters
            if(line.split(",").length == numVars){
                return true;
            }
        }
        return false;
    }
    
    public abstract void event(Variable[] vars);
}
