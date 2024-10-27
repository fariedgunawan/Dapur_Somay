/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpmod7;

/**
 *
 * @author farie
 */
public class TPMOD7 {

    public static void main(String[] args) {
        HomePage homePage = new HomePage("Home Page");
        DashboardPage dashboardPage = new DashboardPage("Dashboard Page");
        
        System.out.println("Terjadi apabila tidak ada aktifitas login");
        homePage.showFullPage(); 
        
        System.out.println("");
        System.out.println("Terjadi apabila ada aktifitas login");
        homePage.login("Faried");
        homePage.showFullPage(); 
        
        System.out.println("");
        System.out.println("Terjadi apabila tidak ada aktifitas login");
        dashboardPage.showFullPage(); 
        
        System.out.println("");
        System.out.println("Terjadi apabila ada aktifitas login");
        dashboardPage.login("Gunawan"); 
        dashboardPage.showFullPage(); 
    }
}
