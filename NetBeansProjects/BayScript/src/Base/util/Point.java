/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Base.util;

/**
 *
 * @author Bayjose
 */
public class Point {
    private float x, y, z;
    float scale = 1;
    
    public Point(float x, float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    
    public Point addPoint(Point p2){
        x=x+p2.getX();
        y=y+p2.getY();
        z=z+p2.getZ();
        return this;
    }
    
    public Point multiplyPoint(Point p2){
        x=x*p2.getX();
        y=y*p2.getY();
        z=z*p2.getZ();
        return this;
    }
    
    public float getX(){
        return this.x*this.scale;
    }
    
    public float getY(){
        return this.y*this.scale;
    }
    
    public float getZ(){
        return this.z*this.scale;
    }
    
    public void setX(float x){
        this.x = x;
    }
    
    public void setY(float y){
        this.y = y;
    }
    
    public void setZ(float z){
        this.z = z;
    }
    
    
    public void setPoint(float x, float y, float z){
        this.x = x*this.scale;
        this.y = y*this.scale;
        this.z = z*this.scale;
    }
    
    public void setScale(float scale){
        this.scale = scale;
    }
    
    public float getScale(){
        return this.scale;
    }
    
    public void increaseScale(float newScale){
        this.scale+=newScale;
    }
    
    public java.awt.Point toJavaPoint(){
        return new java.awt.Point((int)this.x, (int)this.y);
    }
    public java.awt.Point toJavaPointWithTranslation(int transX, int transY){
        return new java.awt.Point((int)this.x+transX, (int)this.y+transY);
    }
}
