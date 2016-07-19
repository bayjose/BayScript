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
public class DistanceCalculator {
    public static int CalculateDistance(int x, int y, int xx, int yy){
        double x1 = x ;
        double y1 = y ;
        double x2 = xx;
        double y2 = yy;
        return (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    public static float CalculateDistanceF(float x, float y, float xx, float yy){
        double x1 = x ;
        double y1 = y ;
        double x2 = xx;
        double y2 = yy;
        return (float) Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    public static int CalculateYDifference(int y, int yy){
        double x1 = 0 ;
        double y1 = y ;
        double x2 = 0;
        double y2 = yy;
        return (int)((y1-y2));
    }
    public static int CalculateXDifference(int x, int xx){
        double x1 = x ;
        double y1 = 0 ;
        double x2 = xx;
        double y2 = 0;
        return (int)((x1-x2));
    }
    public static float CalculateYDifferenceF(float y, float yy){
        float x1 = 0 ;
        float y1 = y ;
        float x2 = 0;
        float y2 = yy;
        return (float)((x1-x2)+(y1-y2));
    }
    public static float CalculateXDifferenceF(float x, float xx){
        float x1 = x ;
        float y1 = 0 ;
        float x2 = xx;
        float y2 = 0;
        return (float)((x1-x2)+(y1-y2));
    }
    
    public static float CalculateXYZDifferenceF(float x, float xx, float y, float yy, float z, float zz){
        return (float) Math.sqrt(((xx - x)*(xx - x))+((yy - y)*(yy - y))+((zz - z)*(zz - z)));
    }
}
