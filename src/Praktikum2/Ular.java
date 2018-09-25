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
public class Ular extends Reptile {

    public Ular(String nama, String makanan, String habitat, String caraBergerak, String contohBinatang) {
        this.nama = nama;
        this.makanan = makanan;
        this.habitat = habitat;
        this.caraBergerak = caraBergerak;
        this.contohBinatang = contohBinatang;
    }

    public void tampil() {
        System.out.println("\n====================================");
        System.out.println("Jenis Reptile \t\t: " + nama);
        System.out.println("Jenis Makanan \t\t:" + makanan);
        System.out.println("Tempat hidup/habitat    :" + habitat);
        System.out.println("Bergerak menggunakan    : " + caraBergerak);
        System.out.println("contoh binatang         : " + contohBinatang);
    }
}
