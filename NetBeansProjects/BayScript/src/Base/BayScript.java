package Base;


import Base.Keyboard;
import Base.MouseInput;
import Command.Command;
import ScriptingEngine.Script;
import ScriptingEngine.exceptions.ScriptNotFoundException;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayjose
 */
public class BayScript extends Canvas implements Runnable{
    
    private static boolean running = false;
    private static Thread thread;
    
    public static final boolean debug = false;
    private int frames = 0;
    
    private static Graphics g = null;
    public static int WIDTH = 0;
    public static int HEIGHT = 0;
    
    private static final String version = "1.01";
    public static LinkedList<Script> scripts = new LinkedList<Script>();
    
    private static Canvas canvas = null;
    
    public static boolean isRunning(){
        return running;
    }
    
    public static void invoke(){
        invokeCall(null);
    }
    
    public static void invoke(Canvas canvas){
        invokeCall(canvas);
    }
    
    private static void invokeCall(Canvas canvas){
        if(running)
            return;
        BayScript.startMessage();
        
        BayScript.canvas = canvas;
        running = true;
        thread = new Thread(new BayScript());
        thread.start();
    }
    
    private static void startMessage(){
        System.out.println("////////////////////////////");
        System.out.println("BayScript Version:"+version);
        System.out.println("A Scripting Language Extension for Java");
        System.out.println("Created by Bailey in 2015");
        System.out.println("////////////////////////////");
    }
    
    public static void registerCommand(Command cmd){
        cmd.register();
    }

    @Override
    public void run() {
        init();
        long last = System.nanoTime();
        final float ticksPerSecond = 60.0f;
        int frames = 0;
        int ticks = 0;
        long age = System.currentTimeMillis();
        long extra = 0;
        
        while(this.running){
            long now = System.nanoTime();
            while((now-last)+extra>=(1000000000.0/ticksPerSecond)){
                ticks++;
                tick();
                extra += (now-last);
                extra -=(1000000000.0/ticksPerSecond);
                last = now;
            }
            
            if(g != null){
                render();
                frames++;
            }
            
            if(System.currentTimeMillis() - age > 1000){
                age = System.currentTimeMillis();
                if(debug){
                    System.out.println("Ticks:"+ticks+" Frames:"+frames);
                }
                ticks = 0;
                this.frames=frames;
                frames = 0;
            }
        }
    }
    
    public void init(){
        System.out.println("Starting Listeners...");
        try{
            if(canvas!=null){
                canvas.addMouseListener(new MouseInput());
                canvas.addKeyListener(new Keyboard());
                WIDTH = canvas.getWidth();
                HEIGHT = canvas.getHeight();
            }else{
                System.out.println("No Canvas Established... Initializing Canvas");
                Window window = new Window(this);
                this.addMouseListener(new MouseInput());
                this.addKeyListener(new Keyboard());
                WIDTH = this.getWidth();
                HEIGHT = this.getHeight();
            }
            System.out.println("Success...");
        }catch(Exception e){
            System.out.println("Failure...");
            e.printStackTrace();
        }
    }
    
    public void tick(){
        if(scripts.size()>0){
            if(scripts.getFirst().remove == true){
                scripts.remove();
            }else{
                scripts.getFirst().tick();
            }
        }
    }
    
    public void render(){
       if(scripts.size()>0){
                {
                    scripts.getFirst().render(g);
                }
            }
    }
    
    public static void addScript(String name, String[] data){
        Script script = new Script(name, data);
        BayScript.scripts.add(script);
    }
    
    public static Script findScript(String name, LinkedList<Script> scripts) throws ScriptNotFoundException{
        for(int i = 0; i < scripts.size(); i++){
            if(scripts.get(i).name.replace(".txt", "").equals(name)){
                return scripts.get(i);
            }
            for(int j= 0; j< scripts.get(i).getSubscripts().size(); j++){
                return BayScript.findScript(name, scripts.get(i).getSubscripts());
            }
        }
        
        throw new ScriptNotFoundException(name);
    }
}
