/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmod7;

/**
 *
 * @author farie
 */
public class HomePage extends WebPage implements Loginable{
    
    public HomePage(String title){
        super(title);
    }
    
    @Override
    public void login(String input){
        super.loggedUsername = input;
        System.out.println("Selamat Datang di halaman Home, " + input + "!");
    }
    
    @Override
    protected void showMainPage(){
        if (super.loggedUsername == null){
            System.out.println("#Selamat Datang#");
            System.out.println("#Anda Sedang Berada di Home Page");
            System.out.println("#Ini Penjelasan Umum Home Page");
        }else{
            System.out.println("#Selamat Datang, " + super.loggedUsername + "!");
            System.out.println("#Anda Sedang Berada di Home Page");
            System.out.println("#Ini Penjelasan Khusus Home Page");
        }
    }
}
