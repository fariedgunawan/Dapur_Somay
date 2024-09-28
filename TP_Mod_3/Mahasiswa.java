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
    
    public Mahasiswa(String namaMahasiswa,Prodi prodi){
        this.namaMahasiswa = namaMahasiswa;
        this.prodi = prodi;
    }
    
    public void setNamaMahasiswa(String namaMahasiswa){
        this.namaMahasiswa = namaMahasiswa;
    }
    
    public void setProdi(Prodi prodi){
        this.prodi = prodi;
    }
    
    public String getNamaMahasiswa(){
        return this.namaMahasiswa;
    }
    
    public Prodi getNamaProdi(){
        return this.prodi;
    }
    
    public void displayMahasiswa(){
        System.out.println("Nama Mahasiswa: " + this.namaMahasiswa);
        System.out.println("Nama Prodi: " + this.prodi.getNamaProdi());
    }
    
}
