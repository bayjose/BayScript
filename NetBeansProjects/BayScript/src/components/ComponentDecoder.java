/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import Base.util.StringUtils;

/**
 *
 * @author Bayjose
 */
public class ComponentDecoder {
    
    /**
    *
    * Structure for storing Component data
    * -Component ID (EnumComponent Type)
    * -Any other data that needs to be stored in this specific component
    */
    
    private static final boolean debug = false;
    
    public ComponentDecoder(){
        
    }
    
    public static Component Decode(String[] data){
        if(data!=null){
            //pull out id, the first pice of the data
            String id = data[0].replace("Component_", "");
            //remove any white space that may be in front of the id. 
            if(debug){
                System.out.println("Setting up component:"+id);
            }
            //store and pass on any extra data to the component
            String[] parsedData = new String[data.length-1];
            for(int i=1; i<data.length; i++){
                parsedData[i-1] = data[i];
                if(debug){
                    System.out.println(data[i]);
                }
            }
            
            if(id.equals(EnumComponentType.Image.toString())){
               return new ComponentImage(parsedData); 
            }


            System.err.println("Component:"+id+" was not recognised.");
        }
        return null;
    }
    
    
}
