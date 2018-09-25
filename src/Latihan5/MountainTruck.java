/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author Indrachelsea
 */
public class MountainTruck extends Truck{
    public int seatHeight;
    public MountainTruck(int startHeight,int startCadence,int startSpeed,int startGear){
        super(startCadence,startSpeed,startGear);
        seatHeight = startHeight;
    }
    public void setheight(int newValue){
        seatHeight = newValue;
    }
    public static void main(String[]aku){
        System.out.println("Mulai Berjalan");
        MountainTruck a = new MountainTruck(0,0,0,0);
        System.out.println("gear="+a.gear);
        System.out.println("speed="+a.speed);
        a.setGear(2);
        a.speedUp(2);
        System.out.println("gear="+a.gear);
        System.out.println("speed="+a.speed);
        a.speedUp(2);
        System.out.println("gear="+a.gear);
        System.out.println("speed="+a.speed);
    }
}
