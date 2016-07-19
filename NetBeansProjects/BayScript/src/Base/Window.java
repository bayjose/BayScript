/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import ScriptingEngine.GlobalVars;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Bayjose
 */
public class Window {
    
    public Window(Canvas screen){
        JFrame frame = new JFrame(GlobalVars.getVar("defaultName"));
        Dimension dim = new Dimension(256,256);
        
        screen.setPreferredSize(dim);
        screen.setMaximumSize(dim);
        screen.setMinimumSize(dim);
        
        frame.setSize(dim);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(screen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
