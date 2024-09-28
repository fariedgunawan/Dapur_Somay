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
        Prodi pr1 = new Prodi();
        Prodi pr2 = new Prodi();

        //set nama prodi
        pr1.setNama("Informatika");
        pr2.setNama("Rekayasa Perangkat Lunak");

        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();

        //set nama mahasiswa
        mhs1.setNamaMahasiswa("Heritsam Yuniawan");
        mhs2.setNamaMahasiswa("Nugroho Rahmanto");
        
        //set prodi mahasiswa
        mhs1.setProdi(pr1);
        mhs2.setProdi(pr2);

 
        System.out.println("Data Mahasiswa 1:");
        mhs1.displayMahasiswa();

        System.out.println("\nData Mahasiswa 2:");
        mhs2.displayMahasiswa();
    }
}
