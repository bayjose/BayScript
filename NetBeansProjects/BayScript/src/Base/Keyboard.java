/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Bayjose
 */
public class Keyboard extends KeyAdapter{

    public static boolean A = false;
    public static boolean B = false;
    public static boolean C = false;
    public static boolean D = false;
    public static boolean E = false;
    public static boolean F = false;
    public static boolean G = false;
    public static boolean H = false;
    public static boolean I = false;
    public static boolean J = false;
    public static boolean K = false;
    public static boolean L = false;
    public static boolean M = false;
    public static boolean N = false;
    public static boolean O = false;
    public static boolean P = false;
    public static boolean Q = false;
    public static boolean R = false;
    public static boolean S = false;
    public static boolean T = false;
    public static boolean U = false;
    public static boolean V = false;
    public static boolean W = false;
    public static boolean X = false;
    public static boolean Y = false;
    public static boolean Z = false;

    public static boolean ENTER = false;
    public static boolean SPACE = false;
    public static boolean ESC = false;
    public static boolean UP = false;
    public static boolean DOWN = false;
    public static boolean LEFT = false;
    public static boolean RIGHT = false;
    public static boolean SHIFT = false;
    
    public static boolean bool_0 = false;
    public static boolean bool_1 = false;
    public static boolean bool_2 = false;
    public static boolean bool_3 = false;
    public static boolean bool_4 = false;
    public static boolean bool_5 = false;
    public static boolean bool_6 = false;
    public static boolean bool_7 = false;
    public static boolean bool_8 = false;
    public static boolean bool_9 = false;
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_0){
            this.bool_0 = !this.bool_0;
        }
        
        if(key == KeyEvent.VK_1){
            this.bool_1 = !this.bool_1;
        }
        
        if(key == KeyEvent.VK_2){
            this.bool_2 = !this.bool_2;
        }
        
        if(key == KeyEvent.VK_3){
            this.bool_3 = !this.bool_3;
        }
        
        if(key == KeyEvent.VK_4){
            this.bool_4 = !this.bool_4;
        }
        
        if(key == KeyEvent.VK_5){
            this.bool_5 = !this.bool_5;
        }
        
        if(key == KeyEvent.VK_6){
            this.bool_6 = !this.bool_6;
        }
        
        if(key == KeyEvent.VK_7){
            this.bool_7 = !this.bool_7;
        }
        
        if(key == KeyEvent.VK_8){
            this.bool_8 = !this.bool_8;
        }
        
        if(key == KeyEvent.VK_9){
            this.bool_9 = !this.bool_9;
        }
        
       
        if(key == KeyEvent.VK_A){
            Keyboard.A = true;
        }
        if(key == KeyEvent.VK_B){
            Keyboard.B = true;
        }
        if(key == KeyEvent.VK_C){
            Keyboard.C = true;
        }
        if(key == KeyEvent.VK_D){
            Keyboard.D = true;
        }
        if(key == KeyEvent.VK_E){
            Keyboard.E = true;
        }
        if(key == KeyEvent.VK_F){
            Keyboard.F = true;
        }
        if(key == KeyEvent.VK_G){
            Keyboard.G = true;
        }
        if(key == KeyEvent.VK_H){
            Keyboard.H = true;
        }
        if(key == KeyEvent.VK_I){
            Keyboard.I = true;
        }
        if(key == KeyEvent.VK_J){
            Keyboard.J = true;
        }
        if(key == KeyEvent.VK_K){
            Keyboard.K = true;
        }
        if(key == KeyEvent.VK_L){
            Keyboard.L = true;
        }
        if(key == KeyEvent.VK_M){
            Keyboard.M = true;
        }
        if(key == KeyEvent.VK_N){
            Keyboard.N = true;
        }
        if(key == KeyEvent.VK_O){
            Keyboard.O = true;
        }
        if(key == KeyEvent.VK_P){
            Keyboard.P = true;
        }
        if(key == KeyEvent.VK_Q){
            Keyboard.Q = true;
        }
        if(key == KeyEvent.VK_R){
            Keyboard.R = true;
        }
        if(key == KeyEvent.VK_S){
            Keyboard.S = true;
        }
        if(key == KeyEvent.VK_T){
            Keyboard.T = true;
        }
        if(key == KeyEvent.VK_U){
            Keyboard.U = true;
        }
        if(key == KeyEvent.VK_V){
            Keyboard.V = true;
        }
        if(key == KeyEvent.VK_W){
            Keyboard.W = true;
        }
        if(key == KeyEvent.VK_X){
            Keyboard.X = true;
        }
        if(key == KeyEvent.VK_Y){
            Keyboard.Y = true;
        }
        if(key == KeyEvent.VK_Z){
            Keyboard.Z = true;
        }
        if(key == KeyEvent.VK_SPACE){
            Keyboard.SPACE = true;
        }
        if(key == KeyEvent.VK_ESCAPE){
            Keyboard.ESC = true;
        }
        if(key == KeyEvent.VK_UP){
            Keyboard.UP = true;
        }
        if(key == KeyEvent.VK_DOWN){
            Keyboard.DOWN = true;
        }
        if(key == KeyEvent.VK_LEFT){
            Keyboard.LEFT = true;
        }
        if(key == KeyEvent.VK_RIGHT){
            Keyboard.RIGHT = true;
        }
        if(key == KeyEvent.VK_SHIFT){
            Keyboard.SHIFT = true;
        }
        if(key == KeyEvent.VK_ENTER){
            Keyboard.ENTER = true;
        }
    }
    
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_A){
            Keyboard.A = false;
        }
        if(key == KeyEvent.VK_B){
            Keyboard.B = false;
        }
        if(key == KeyEvent.VK_C){
            Keyboard.C = false;
        }
        if(key == KeyEvent.VK_D){
            Keyboard.D = false;
        }
        if(key == KeyEvent.VK_E){
            Keyboard.E = false;
        }
        if(key == KeyEvent.VK_F){
            Keyboard.F = false;
        }
        if(key == KeyEvent.VK_G){
            Keyboard.G = false;
        }
        if(key == KeyEvent.VK_H){
            Keyboard.H = false;
        }
        if(key == KeyEvent.VK_I){
            Keyboard.I = false;
        }
        if(key == KeyEvent.VK_J){
            Keyboard.J = false;
        }
        if(key == KeyEvent.VK_K){
            Keyboard.K = false;
        }
        if(key == KeyEvent.VK_L){
            Keyboard.L = false;
        }
        if(key == KeyEvent.VK_M){
            Keyboard.M = false;
        }
        if(key == KeyEvent.VK_N){
            Keyboard.N = false;
        }
        if(key == KeyEvent.VK_O){
            Keyboard.O = false;
        }
        if(key == KeyEvent.VK_P){
            Keyboard.P = false;
        }
        if(key == KeyEvent.VK_Q){
            Keyboard.Q = false;
        }
        if(key == KeyEvent.VK_R){
            Keyboard.R = false;
        }
        if(key == KeyEvent.VK_S){
            Keyboard.S = false;
        }
        if(key == KeyEvent.VK_T){
            Keyboard.T = false;
        }
        if(key == KeyEvent.VK_U){
            Keyboard.U = false;
        }
        if(key == KeyEvent.VK_V){
            Keyboard.V = false;
        }
        if(key == KeyEvent.VK_W){
            Keyboard.W = false;
        }
        if(key == KeyEvent.VK_X){
            Keyboard.X = false;
        }
        if(key == KeyEvent.VK_Y){
            Keyboard.Y = false;
        }
        if(key == KeyEvent.VK_Z){
            Keyboard.Z = false;
        }
        if(key == KeyEvent.VK_SPACE){
            Keyboard.SPACE = false;
        }
        if(key == KeyEvent.VK_ESCAPE){
            Keyboard.ESC = false;
        }
        if(key == KeyEvent.VK_UP){
            Keyboard.UP = false;
        }
        if(key == KeyEvent.VK_DOWN){
            Keyboard.DOWN = false;
        }
        if(key == KeyEvent.VK_LEFT){
            Keyboard.LEFT = false;
        }
        if(key == KeyEvent.VK_RIGHT){
            Keyboard.RIGHT = false;
        }
        if(key == KeyEvent.VK_SHIFT){
            Keyboard.SHIFT = false;
        }
        if(key == KeyEvent.VK_ENTER){
            Keyboard.ENTER = false;
        }
    }
    
    public static boolean getKey(String keyValue){
        keyValue = keyValue.toUpperCase();
        if(keyValue.equals("A")){
            return Keyboard.A;
        }
        if(keyValue.equals("B")){
            return Keyboard.B;
        }
        if(keyValue.equals("C")){
            return Keyboard.C;
        }
        if(keyValue.equals("D")){
            return Keyboard.D;
        }
        if(keyValue.equals("E")){
            return Keyboard.E;
        }
        if(keyValue.equals("F")){
            return Keyboard.F;
        }
        if(keyValue.equals("G")){
            return Keyboard.G;
        }
        if(keyValue.equals("H")){
            return Keyboard.H;
        }
        if(keyValue.equals("I")){
            return Keyboard.I;
        }
        if(keyValue.equals("J")){
            return Keyboard.J;
        }
        if(keyValue.equals("K")){
            return Keyboard.K;
        }
        if(keyValue.equals("L")){
            return Keyboard.L;
        }
        if(keyValue.equals("M")){
            return Keyboard.M;
        }
        if(keyValue.equals("N")){
            return Keyboard.N;
        }
        if(keyValue.equals("O")){
            return Keyboard.O;
        }
        if(keyValue.equals("P")){
            return Keyboard.P;
        }
        if(keyValue.equals("Q")){
            return Keyboard.Q;
        }
        if(keyValue.equals("R")){
            return Keyboard.R;
        }
        if(keyValue.equals("S")){
            return Keyboard.S;
        }
        if(keyValue.equals("T")){
            return Keyboard.T;
        }
        if(keyValue.equals("U")){
            return Keyboard.U;
        }
        if(keyValue.equals("V")){
            return Keyboard.V;
        }
        if(keyValue.equals("W")){
            return Keyboard.W;
        }
        if(keyValue.equals("X")){
            return Keyboard.X;
        }
        if(keyValue.equals("Y")){
            return Keyboard.Y;
        }
        if(keyValue.equals("Z")){
            return Keyboard.Z;
        }
        
        //utilites
        if(keyValue.equals("ENTER")){
            return Keyboard.ENTER;
        }
        if(keyValue.equals("SPACE")){
            return Keyboard.SPACE;
        }
        if(keyValue.equals("ESC")){
            return Keyboard.ESC;
        }
        if(keyValue.equals("UP")){
            return Keyboard.UP;
        }
        if(keyValue.equals("DOWN")){
            return Keyboard.DOWN;
        }
        if(keyValue.equals("LEFT")){
            return Keyboard.LEFT;
        }
        if(keyValue.equals("RIGHT")){
            return Keyboard.RIGHT;
        }
        if(keyValue.equals("SHIFT")){
            return Keyboard.SHIFT;
        }
        //mouse
        if(keyValue.equals("LEFTMOUSE")){
            return MouseInput.IsPressed;
        }
        if(keyValue.equals("RIGHTMOUSE")){
            return MouseInput.IsPressed&&MouseInput.IsRightClick;
        }
        
        
        System.err.println("[KeyInput] key:"+keyValue+" was not recognised.");
        return false;
    }
    
    public static void setTrue(String keyValue){
        keyValue = keyValue.toUpperCase();
        if(keyValue.equals("A")){
            Keyboard.A = true;
        }
        if(keyValue.equals("B")){
            Keyboard.B = true;
        }
        if(keyValue.equals("C")){
            Keyboard.C = true;
        }
        if(keyValue.equals("D")){
            Keyboard.D = true;
        }
        if(keyValue.equals("E")){
            Keyboard.E = true;
        }
        if(keyValue.equals("F")){
            Keyboard.F = true;
        }
        if(keyValue.equals("G")){
            Keyboard.G = true;
        }
        if(keyValue.equals("H")){
            Keyboard.H = true;
        }
        if(keyValue.equals("I")){
            Keyboard.I = true;
        }
        if(keyValue.equals("J")){
            Keyboard.J = true;
        }
        if(keyValue.equals("K")){
            Keyboard.K = true;
        }
        if(keyValue.equals("L")){
            Keyboard.L = true;
        }
        if(keyValue.equals("M")){
            Keyboard.M = true;
        }
        if(keyValue.equals("N")){
            Keyboard.N = true;
        }
        if(keyValue.equals("O")){
            Keyboard.O = true;
        }
        if(keyValue.equals("P")){
            Keyboard.P = true;
        }
        if(keyValue.equals("Q")){
            Keyboard.Q = true;
        }
        if(keyValue.equals("R")){
            Keyboard.R = true;
        }
        if(keyValue.equals("S")){
            Keyboard.S = true;
        }
        if(keyValue.equals("T")){
            Keyboard.T = true;
        }
        if(keyValue.equals("U")){
            Keyboard.U = true;
        }
        if(keyValue.equals("V")){
            Keyboard.V = true;
        }
        if(keyValue.equals("W")){
            Keyboard.W = true;
        }
        if(keyValue.equals("X")){
            Keyboard.X = true;
        }
        if(keyValue.equals("Y")){
            Keyboard.Y = true;
        }
        if(keyValue.equals("Z")){
            Keyboard.Z = true;
        }
        
        //utilites
        if(keyValue.equals("ENTER")){
            Keyboard.ENTER = true;
        }
        if(keyValue.equals("SPACE")){
            Keyboard.SPACE = true;
        }
        if(keyValue.equals("ESC")){
            Keyboard.ESC = true;
        }
        if(keyValue.equals("UP")){
            Keyboard.UP = true;
        }
        if(keyValue.equals("DOWN")){
            Keyboard.DOWN = true;
        }
        if(keyValue.equals("LEFT")){
            Keyboard.LEFT = true;
        }
        if(keyValue.equals("RIGHT")){
            Keyboard.RIGHT = true;
        }
        if(keyValue.equals("SHIFT")){
            Keyboard.SHIFT = true;
        }
        
        if(keyValue.equals("0")){
            Keyboard.bool_0 = true;
        }
        if(keyValue.equals("1")){
            Keyboard.bool_1 = true;
        }
        if(keyValue.equals("2")){
            Keyboard.bool_2 = true;
        }
        if(keyValue.equals("3")){
            Keyboard.bool_3 = true;
        }
        if(keyValue.equals("4")){
            Keyboard.bool_4 = true;
        }
        if(keyValue.equals("5")){
            Keyboard.bool_5 = true;
        }
        if(keyValue.equals("6")){
            Keyboard.bool_6 = true;
        }
        if(keyValue.equals("7")){
            Keyboard.bool_7 = true;
        }
        if(keyValue.equals("8")){
            Keyboard.bool_8 = true;
        }
        if(keyValue.equals("9")){
            Keyboard.bool_9 = true;
        }
    }
    
    public static void setFalse(String keyValue){
        keyValue = keyValue.toUpperCase();
        if(keyValue.equals("A")){
            Keyboard.A = false;
        }
        if(keyValue.equals("B")){
            Keyboard.B = false;
        }
        if(keyValue.equals("C")){
            Keyboard.C = false;
        }
        if(keyValue.equals("D")){
            Keyboard.D = false;
        }
        if(keyValue.equals("E")){
            Keyboard.E = false;
        }
        if(keyValue.equals("F")){
            Keyboard.F = false;
        }
        if(keyValue.equals("G")){
            Keyboard.G = false;
        }
        if(keyValue.equals("H")){
            Keyboard.H = false;
        }
        if(keyValue.equals("I")){
            Keyboard.I = false;
        }
        if(keyValue.equals("J")){
            Keyboard.J = false;
        }
        if(keyValue.equals("K")){
            Keyboard.K = false;
        }
        if(keyValue.equals("L")){
            Keyboard.L = false;
        }
        if(keyValue.equals("M")){
            Keyboard.M = false;
        }
        if(keyValue.equals("N")){
            Keyboard.N = false;
        }
        if(keyValue.equals("O")){
            Keyboard.O = false;
        }
        if(keyValue.equals("P")){
            Keyboard.P = false;
        }
        if(keyValue.equals("Q")){
            Keyboard.Q = false;
        }
        if(keyValue.equals("R")){
            Keyboard.R = false;
        }
        if(keyValue.equals("S")){
            Keyboard.S = false;
        }
        if(keyValue.equals("T")){
            Keyboard.T = false;
        }
        if(keyValue.equals("U")){
            Keyboard.U = false;
        }
        if(keyValue.equals("V")){
            Keyboard.V = false;
        }
        if(keyValue.equals("W")){
            Keyboard.W = false;
        }
        if(keyValue.equals("X")){
            Keyboard.X = false;
        }
        if(keyValue.equals("Y")){
            Keyboard.Y = false;
        }
        if(keyValue.equals("Z")){
            Keyboard.Z = false;
        }
        
        //utilites
        if(keyValue.equals("ENTER")){
            Keyboard.ENTER = false;
        }
        if(keyValue.equals("SPACE")){
            Keyboard.SPACE = false;
        }
        if(keyValue.equals("ESC")){
            Keyboard.ESC = false;
        }
        if(keyValue.equals("UP")){
            Keyboard.UP = false;
        }
        if(keyValue.equals("DOWN")){
            Keyboard.DOWN = false;
        }
        if(keyValue.equals("LEFT")){
            Keyboard.LEFT = false;
        }
        if(keyValue.equals("RIGHT")){
            Keyboard.RIGHT = false;
        }
        if(keyValue.equals("SHIFT")){
            Keyboard.SHIFT = false;
        }
        
        if(keyValue.equals("0")){
            Keyboard.bool_0 = false;
        }
        if(keyValue.equals("1")){
            Keyboard.bool_1 = false;
        }
        if(keyValue.equals("2")){
            Keyboard.bool_2 = false;
        }
        if(keyValue.equals("3")){
            Keyboard.bool_3 = false;
        }
        if(keyValue.equals("4")){
            Keyboard.bool_4 = false;
        }
        if(keyValue.equals("5")){
            Keyboard.bool_5 = false;
        }
        if(keyValue.equals("6")){
            Keyboard.bool_6 = false;
        }
        if(keyValue.equals("7")){
            Keyboard.bool_7 = false;
        }
        if(keyValue.equals("8")){
            Keyboard.bool_8 = false;
        }
        if(keyValue.equals("9")){
            Keyboard.bool_9 = false;
        }
    }
    
}
