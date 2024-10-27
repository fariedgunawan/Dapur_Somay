/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmod7;

/**
 *
 * @author farie
 */
public class DashboardPage extends WebPage implements Loginable {
    
    public DashboardPage(String title){
        super(title);
    }
    
    @Override
    public void login(String input){
        super.loggedUsername = input;
        System.out.println(input + " berhasil login ke halaman dashboard");
    }
    
    @Override
    protected void showMainPage(){
        if (super.loggedUsername == null){
            System.out.println("#Akses Ditutup Untuk User Guest");
            System.out.println("#Mohon Login Terlebih Dahulu");
        }else{
            System.out.println("#Dashboard Page - " + super.loggedUsername);
            System.out.println("#Opsi-Opsi Page Dashboard");
            System.out.println("#dsb.");
        }
    }
}
