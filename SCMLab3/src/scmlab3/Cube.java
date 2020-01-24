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
public class Cube implements Shape {
    final private double lenght;
    Cube(double lenght){
        this.lenght = lenght;
    }

    @Override
    public double volume() {
        return Math.pow(lenght, 3);
    }

    @Override
    public double area() {
        return Math.pow(lenght, 2)*6;
    }
    
}
