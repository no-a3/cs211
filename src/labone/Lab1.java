/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labone;

/**
 *
 * @author USER
 */
public class Lab1 {
    
    int x=1;
    final int y=2;  //final mean that it will not change
    int z;
    
    public Lab1(){
        
    }
    
    public Lab1(int z){
        
        this.z=z;
        
    }
    
    public void setX(int x){
        
        this.x = x;
    }
    public static void staticMethod(){

System.out.println("Static");
}
    public static void publicMethod(){
        
        System.out.println("Public");
    }
    
    public void name(String s){
        System.out.println("my name is: " + s);
    }
    
    public static int number (int x){
        return x;
    }
}
