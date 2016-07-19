/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Bayjose
 */
public class ComponentImage extends Component{

    public Image image;
    public int x=-1, y=-1;
    
    public ComponentImage(String[] data) {
        super(EnumComponentType.Image, data);
//        this.image = SpriteBinder.checkImage(data[0]);
    }
    
    @Override
    public void onInit(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    @Override
    String[] save() {
        return new String[]{
            this.LoadedData[0]
        };
    }
    
    @Override
    public void render(Graphics g, int x, int y){
        g.drawImage(image, x, y, null);
    }
    
    @Override
    public void render(Graphics g){
        g.drawImage(image, x, y, null);
    }
}
