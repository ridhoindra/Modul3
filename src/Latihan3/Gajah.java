/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author Indrachelsea
 */
public class Gajah extends Hewan{
    public static void testClassMethod(){
        System.out.println("The Class Method in Hewan...");
}
    public void testInstanceMethod(){
        System.out.println("The instance method in Gajah...");
    }
    public static void main(String[] args){
        Gajah a = new Gajah();
        Hewan b = a;
        Hewan.testClassMethod();
        b.testInstanceMethod();
    }
}
