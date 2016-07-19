/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

/**
 *
 * @author Bayjose
 */
public class ComponentUtils {
    
    public static Component[] addComponent(Component[] components, Component toAdd){
        Component[] newData = new Component[components.length+1];
        newData[0] = toAdd;
        for(int i=0; i<components.length; i++){
            newData[i+1] = components[i];
        }
        return newData;
    }
    
    public static Component[] removeComponent(Component[] components, int id){
        if(id>=0){
            components[id].onRemoved();
            Component[] oldData = components;
            oldData[id] = null;
            Component[] newData = new Component[components.length-1];
            for(int i=0; i<oldData.length; i++){
               if(i<id){
                   newData[i] = oldData[i];
               }else if(i==id){
                   //this is where the data is null
               }else if(i>id){
                   newData[i-1] = oldData[i];
               } 
            }
            return newData;  
        }
        return components;
    }
    
}
