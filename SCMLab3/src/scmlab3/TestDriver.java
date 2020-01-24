/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scmlab3;

/**
 *
 * @author STD-PC
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Shape s1 = new Sphere(2.01);
        System.out.println("Sphere's volume = "+s1.volume()+" m^3");
        System.out.println("Sphere's area = "+s1.area()+" m^2");
        
        Shape s2 = new Cube(14.251);
        System.out.println("Cube's volume = "+s2.volume()+" m^3");
        System.out.println("Cube's area = "+s2.area()+" m^2");
    }
    
}
