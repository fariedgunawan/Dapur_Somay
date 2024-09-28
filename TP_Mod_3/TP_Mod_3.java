/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod_3;

/**
 *
 * @author farie
 */
public class TP_Mod_3 {

    public static void main(String[] args) {
        Prodi pr1 = new Prodi("Informatika");
        Prodi pr2 = new Prodi("Rekayasa Perangkat Lunak");

        Mahasiswa mhs1 = new Mahasiswa("Heritsam Yuniawan", pr1);
        Mahasiswa mhs2 = new Mahasiswa("Nugroho Rahmanto", pr2);

 
        System.out.println("Data Mahasiswa 1:");
        mhs1.displayMahasiswa();

        System.out.println("\nData Mahasiswa 2:");
        mhs2.displayMahasiswa();
    }
}
