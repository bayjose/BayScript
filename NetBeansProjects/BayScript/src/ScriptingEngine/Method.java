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
public class Method {
    public String name;
    public String[] body;
    public boolean internal = false;
    private Variable[] vars;
    
    public Method(String name, Variable[] vars, String[] body, boolean internal){
        this.name = name;
        this.body = body;
        this.internal = internal;
        this.vars = vars;
    }
    
}
