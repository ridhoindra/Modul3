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
public class jenisMamalia {
    public static void main (String[]args) {

 Jenis jns = new Jenis();
 Sapi spi = new Sapi ("Sapi","Rumput","Darat","kaki");
 Kucing kcng = new Kucing ("Kucing","Daging","Darat","Kaki");
 Anjing ajg = new Anjing ("Anjing","Daging","Darat","buldog");
 jns.tampil();
 spi.tampil();
 kcng.tampil();
 ajg.tampil();
 }
}
