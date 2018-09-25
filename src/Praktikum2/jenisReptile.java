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
public class jenisReptile {

    public static void main(String[] args) {

        Jenis jns = new Jenis();
        Ular ulr = new Ular("Ular", "Tikus", "Darat", "Melata", "phyton,anaconda");
        Buaya bya = new Buaya("Buaya", "Daging", "Rawa", "Kaki");
        Cicak cck = new Cicak("Cicak", "Serangga", "Darat", "kaki");
        jns.tampil();
        ulr.tampil();
        bya.tampil();
        cck.tampil();
    }
}
