/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.awt.Graphics;

/**
 *
 * @author Bayjose
 */
public abstract class Component {
    
    public EnumComponentType ect;
    protected String[] LoadedData;
    
    public Component(EnumComponentType ect, String[] data){
        this.ect = ect;
        LoadedData = data;
    }
    
    public String[] Save(){
        String[] tempSaveData = this.save();
        String[] saveData = new String[tempSaveData.length+1];
        saveData[0]= "Component_"+this.ect.toString();
        for(int i=0; i<tempSaveData.length; i++){
            saveData[i+1] = tempSaveData[i];
        }
        return saveData;
    }
    abstract String[] save();
    
    public String[] getData(){
        return this.LoadedData;
    }
    
    
    public void onInit(int x, int y){
        return;
    }
    
    public void onHoverInSlot(Graphics g){
        return;
    }
    
    public void tickInInvenory(){
        return;
    }
    
    public void tick(){
        return;
    }
    
    public void tick(int x, int y){
        return;
    }
    
    public void render(Graphics g){
        return;
    }
    
    public void render(Graphics g, int x, int y){
        return;
    }
    
    public void onPickup(){
        return;
    }
    
    public void onDrop(){
        return;
    }
    
    public void onRemoved(){
        return;
    }
    
    public void onAddedToInv(){
        return;
    }
    
    public void onRightClick(){
        return;
    }
    
    public void onLeftClick(){
        return;
    }
    
    public void onBreak(){
        return;
    }
    
    public void onWalking(){
        return;
    }
}
