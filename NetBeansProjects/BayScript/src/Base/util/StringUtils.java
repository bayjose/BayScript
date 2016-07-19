/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base.util;

import java.io.File;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Bayjose
 */
public class StringUtils {
    
    private static String path = "";
    private static Random r = new Random();
    private static LoadedFile lastFile = new LoadedFile("", new String[]{});
    
    public static String randomExtension(int length){
        String[] characters = new String[62];
        
        characters[0]="A";
        characters[1]="a";
        characters[2]="b";
        characters[3]="c";
        characters[4]="d";
        characters[5]="e";
        characters[6]="f";
        characters[7]="g";
        characters[8]="h";
        characters[9]="i";
        characters[10]="j";
        characters[11]="k";
        characters[12]="l";
        characters[13]="m";
        characters[14]="n";
        characters[15]="o";
        characters[16]="p";
        characters[17]="q";
        characters[18]="r";
        characters[19]="s";
        characters[20]="t";
        characters[21]="u";
        characters[22]="v";
        characters[23]="w";
        characters[24]="x";
        characters[25]="y";
        characters[26]="z";
        characters[27]="0";
        characters[28]="1";
        characters[29]="2";
        characters[30]="3";
        characters[31]="4";
        characters[32]="5";
        characters[33]="6";
        characters[34]="7";
        characters[35]="8";
        characters[36]="9";
        characters[37]="B";
        characters[38]="C";
        characters[39]="D";
        characters[40]="E";
        characters[41]="F";
        characters[42]="G";
        characters[43]="H";
        characters[44]="I";
        characters[45]="J";
        characters[46]="K";
        characters[47]="L";
        characters[48]="M";
        characters[49]="N";
        characters[50]="O";
        characters[51]="P";
        characters[52]="Q";
        characters[53]="R";
        characters[54]="S";
        characters[55]="T";
        characters[56]="U";
        characters[57]="V";
        characters[58]="W";
        characters[59]="X";
        characters[60]="Y";
        characters[61]="Z";
        
        String output = "";
        
        for(int i=0; i<length; i++){
            output+=characters[r.nextInt(characters.length)];
        }
        return output;
    }
    
    /**
     *
     * @param base The base string to be added onto
     * @param add The data to add to the base string
     * @return
     */
    
    
    public static String[] CombineArrays(String[] base, String[] add){
        String[] temp = new String[base.length+add.length];
        for(int i=0; i<base.length; i++){
            temp[i]=base[i];
        }
        for(int i=0; i<add.length; i++){
            temp[i+base.length]=add[i];
        }
                
        return temp;
    }
    
    public static String[] addLine(String[] base, String add){
        String[] temp = new String[base.length+1];
        for(int i=0; i<base.length; i++){
            temp[i] = base[i];
        }
        temp[base.length]=add;
        return temp;
    }
    
//     public static String[] removeLine(String[] base, int pos){
//        if(pos>0 && pos<base.length-1){
//            String[] temp = new String[base.length-1];
//            for(int i=0; i<base.length; i++){
//                temp[i] = base[i];
//            }
//            temp[base.length]=add;
//            return temp;
//        }
//    }
    
    public static String unify(String[] data){
        String out = "";
        for(int i=0; i<data.length; i++){
            out+=data[i];
        }
        return out;
    }
    
    public static String randomLine(String[] in){
        int index = (int)(in.length * Math.random());
        return in[index];
    }
    
    public static String[] loadData(String path){
        if(path.equals(StringUtils.lastFile.id)){
            return StringUtils.lastFile.data.clone();
        }
        LinkedList<String> data = new LinkedList<String>();
        try {
            Scanner in = new Scanner(new File(StringUtils.getAbsPath()+path));
            do{
                data.add(in.nextLine());
            }while(in.hasNext());
        } catch (Exception e) {
            StringUtils.path = "cpu";
            try{
                Scanner in = new Scanner(new File(StringUtils.getAbsPath()+path));
                do{
                data.add(in.nextLine());
                }while(in.hasNext());
                in.close();
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
        String[] outData = new String[data.size()];
        for(int i=0; i<outData.length; i++){
            outData[i] = data.get(i);
        }
        lastFile = new LoadedFile(path, outData);
        return outData;
    }
    
    public static String[] forceLoadData(String path){
        LinkedList<String> data = new LinkedList<String>();
        try {
            Scanner in = new Scanner(new File(StringUtils.getAbsPath()+path));
            do{
                data.add(in.nextLine());
            }while(in.hasNext());
            in.close();
        } catch (StackOverflowError e) {
            
        }catch (Exception e) {
            StringUtils.path = "cpu";
            try{
                Scanner in = new Scanner(new File(StringUtils.getAbsPath()+path));
                do{
                data.add(in.nextLine());
                }while(in.hasNext());
                in.close();
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
        String[] outData = new String[data.size()];
        for(int i=0; i<outData.length; i++){
            outData[i] = data.get(i);
        }
        return outData;
    }
    
    public static void saveData(String path, String[] data){

        try {
            PrintWriter p = new PrintWriter(new File(StringUtils.getAbsPath()+path));
            for(int i = 0; i<data.length; i++){
                p.println(data[i]);
            }
            p.close();
        } catch (Exception e) {
            try{
                PrintWriter p2 = new PrintWriter(new File(StringUtils.getAbsPath()+path));
                for (int i = 0; i < data.length; i++) {
                    p2.println(data[i]);
                }
                p2.close();
            }catch(Exception e2){
//                e2.printStackTrace();
            }
        }
    }
    
    public static String[] loadUrl(String urlpath){
        String[] out = new String[]{};
        try {
            URL path = new URL(urlpath);
            Scanner scanner = new Scanner(path.openStream());
            for(boolean b=true; b==true;){
                String tmpData = scanner.nextLine();
                if(!tmpData.isEmpty()){
                    System.out.println(tmpData);
                    out = StringUtils.addLine(out, tmpData);
                }else{
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return out;
    }
    
    public static void printAllLines(String[] data){
        System.out.println("Printing:"+data.toString()+"-------------");
        for(int i=0; i<data.length; i++){
            System.out.println(data[i]);
        }
    }
    
    public static String getAbsPath(){
        String absPath;
        if(path.equals("cpu")){
            try {
                absPath = StringUtils.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
//                System.out.println("Absolute Path:"+absPath);
                absPath = absPath.replace("/Magic.jar", "/");
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
                absPath = "";
            }
        }else{
            absPath = "";
        }
        return absPath;
    }

    public static int countMatches(String data, String string) {
        int index = 0;
        for(int i=0; i<data.length(); i++){
            if((data.charAt(i)+"").equals(string)){
                index++;
            }
        }
        return index;
    }
    
    public static String removeFrontSpacing(String in){
        String out = in.replaceAll("\t", "");
        while(out.startsWith(" ")){
            out = out.replaceFirst(" ", "");
        }
        return out+"";
    }
    public static String[] Encrypt(String seed, String[] data){
        Random rand = new Random(seed.hashCode());
        String[] out = new String[]{};
        for(int i = 0; i< data.length; i++){
            String tmp = "";
            for(int j = 0; j< data[i].length(); j++){
                tmp = tmp+(char)((int)data[i].charAt(j) + (rand.nextInt(1024)-512))+"";
            }
            out = StringUtils.addLine(out, tmp);
            System.out.println(tmp);
        }
        return out;
    }
    public static String[] Decrypt(String seed, String[] data){
        Random rand = new Random(seed.hashCode());
        String[] out = new String[]{};
        for(int i = 0; i< data.length; i++){
            String tmp = "";
            for(int j = 0; j< data[i].length(); j++){
                tmp = tmp+(char)((int)data[i].charAt(j) - (rand.nextInt(1024)-512))+"";
            }
            out = StringUtils.addLine(out, tmp);
            System.out.println(tmp);
        }
        return out;
    }
    
}

class LoadedFile{
    public String id;
    public String[] data;
    
    public LoadedFile(String id, String[] data){
        this.id = id;
        this.data = data;
    }
}