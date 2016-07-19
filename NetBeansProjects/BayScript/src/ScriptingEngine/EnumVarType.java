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
public enum EnumVarType {
    INT("int", new VarInt("", "")),
    FLOAT("float", new VarFloat("", "")),
    BOOLEAN("boolean", new VarBoolean("", "")),
    STRING("String", new VarString("", ""));
    
    EnumVarType(String id, Variable var){
        this.id = id;
        this.varType = var;
    }
    
    protected String id;
    protected Variable varType;
}
