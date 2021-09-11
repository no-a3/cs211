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
public class Labone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Lab1 obj1 = new Lab1();
    
    obj1.setX(3);
    obj1.staticMethod();
    obj1.publicMethod();
    obj1.name("Hanoof");
    Lab1 obj3 = new Lab1(3);
    obj1.number(4);
    
    System.out.println("x= "+obj1.x);
    
    Lab1 obj2 = new Lab1();
    System.out.println("y= "+obj1.y);
        System.out.println("z= "+obj3.z);
        
   LabOne2 obj4 = new LabOne2();
   obj4.sum(10, 3);
    
    
    }
    
}
