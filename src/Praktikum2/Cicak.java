/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author Indrachelsea
 */
public class Cicak extends Reptile {

    public Cicak(String nama, String makanan, String habitat, String caraBergerak) {
        this.nama = nama;
        this.makanan = makanan;
        this.habitat = habitat;
        this.caraBergerak = caraBergerak;
    }

    public void tampil() {
        System.out.println("\n====================================");
        System.out.println("Jenis Reptile \t\t: " + nama);
        System.out.println("Jenis Makanan \t\t:" + makanan);
        System.out.println("Tempat hidup/Habitat    :" + habitat);
        System.out.println("caraBergerak         : " + caraBergerak);
    }
}
