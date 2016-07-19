package Base;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 *
 * @author Bayjose
 */
public class MouseInput implements MouseListener{
    

    public static Rectangle Mouse= new Rectangle(0, 0, 1, 1);
    public static boolean IsPressed=false;
    public static boolean IsRightClick=false;
    
    
    //items 
    
            
    public MouseInput(){
        
    }

    public void mouseClicked(MouseEvent e) {
         
    }

    public void doubleClick(){
        
    }
    
    public void mousePressed(MouseEvent e) {
        Mouse.x=(e.getX());
        Mouse.y=(e.getY());
    
        IsPressed=true;
        IsRightClick=false;
//            
        if (e.getButton() == MouseEvent.BUTTON3)
        {
            IsRightClick=true;
        }

        if(!IsRightClick){
            
        }
    }

    public void mouseReleased(MouseEvent e) {
        IsPressed=false;
        IsRightClick=false;
        Keyboard.W = false;
        Keyboard.S = false;
        Keyboard.A = false;
        Keyboard.D = false;
        Keyboard.SPACE = false;
    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
        
    }
}
