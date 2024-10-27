/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmod7;

/**
 *
 * @author farie
 */
public class WebPage {
    String webTitle;
    protected String loggedUsername;

    public WebPage(String title) {
        this.webTitle = title;
    }
    
    protected void showHeader(){
        System.out.println("############### " + this.webTitle + " ###############");
    }
    
    protected void showFooter(){
        System.out.println("############## Muhammad Faried Gunawan #############");
    }
    
    protected void showMainPage(){
    }
    
    public void showFullPage(){
        showHeader();
        showMainPage();
        showFooter();
    }
    
}
