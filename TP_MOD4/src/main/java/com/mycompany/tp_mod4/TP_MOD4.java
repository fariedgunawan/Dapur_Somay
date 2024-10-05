/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod4;

/**
 *
 * @author farie
 */
public class TP_MOD4 {

    public static void main(String[] args) {
        Dokter dt1 = new Dokter("Maulana Malik","Mata");
        Dokter dt2 = new Dokter("Fahryan Tresno","Gigi");
        Dokter dt3 = new Dokter("Priyagung Makmur","Teliga");
        
        Pasien ps1 = new Pasien("Adli Bahri",20);
        Pasien ps2 = new Pasien("Adam Rafif",55);
        Pasien ps3 = new Pasien("Alif Taufiq",37);
        
        Pemesanan[] pemesananList = new Pemesanan[5];
        
        pemesananList[0] = new Pemesanan(dt1, ps1, "Selasa");
        pemesananList[1] = new Pemesanan(dt2, ps1, "Kamis");
        pemesananList[2] = new Pemesanan(dt2, ps2, "Selasa");
        pemesananList[3] = new Pemesanan(dt3, ps2, "Jumat");
        pemesananList[4] = new Pemesanan(dt1, ps3, "Senin");
        
        for (int i = 0; i < pemesananList.length; i++) {
            System.out.println("Pemesanan " + (i + 1) + ":");
            pemesananList[i].showData();
            System.out.println();
        }
    }
}
