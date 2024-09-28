/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_mod_3;

/**
 *
 * @author farie
 */
public class Mahasiswa {
    private String namaMahasiswa;
    private Prodi prodi;
    
    
    public void setNamaMahasiswa(String namaMahasiswa){
        this.namaMahasiswa = namaMahasiswa;
    }
    
    public void setProdi(Prodi prod){
        prodi = prod;
    }
    
    public String getNamaMahasiswa(){
        return this.namaMahasiswa;
    }
    
    public String getNamaProdi(){
        return prodi.getNama();
    }
    
    public void displayMahasiswa(){
        System.out.println("Nama Mahasiswa: " + getNamaMahasiswa());
        System.out.println("Nama Prodi: " + getNamaProdi());
    }
    
}
