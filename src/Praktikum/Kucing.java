/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Indrachelsea
 */
public class Kucing extends Mamalia{
    public Kucing (String nama, String makanan, String habitat, String caraBergerak ) {
  this.nama = nama;
  this.makanan = makanan;
  this.habitat = habitat;
  this.caraBergerak = caraBergerak;
 }
  public void tampil() {
  System.out.println("\n====================================");
  System.out.println("Jenis Mamalia \t\t: " + nama);
  System.out.println("Jenis Makanan \t\t:" + makanan);
  System.out.println("Tempat hidup/Habitat    :" +habitat);
  System.out.println("Bergerak menggunakan    : " +caraBergerak);
  } 
}
