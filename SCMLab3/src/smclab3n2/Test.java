/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smclab3n2;

/**
 *
 * @author STD-PC
 */
public class Test {
    public static void main(String[] args) {
        StackImp stack = new StackImp();
        System.out.println("is stack empty = " + stack.isEmpty());
        stack.push("Object1");
        stack.push("Object2");
        stack.push("Object3");
        stack.push("Object4");
        stack.push("Object5");
        
        System.out.println("is stack empty = " + stack.isEmpty());
        System.out.println("top object = " + stack.top());
        System.out.println("pop object = " +stack.pop());
        System.out.println("pop object = " +stack.pop());
        System.out.println("top object = " +stack.top());
        System.out.println("peek object = " +stack.peek());
        System.out.println("size = " +stack.size());
        
    
    }
    
}
