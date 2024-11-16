/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_mod_10;

/**
 *
 * @author farie
 */
public class UserData {
    private final int userid;
    private final int password;
    private boolean isLoggedIn;

    public UserData(int userid, int password) {
        assert String.valueOf(userid).length() == 4 : "User ID must have 4 digits";
        assert String.valueOf(password).length() == 4 : "Password must have 4 digits";

        this.userid = userid;
        this.password = password;
        this.isLoggedIn = false;
    }

    public void login() throws LoginFailedException {
        if (this.userid + this.password == 10000) {
            this.isLoggedIn = true;
            System.out.println("Login successful for user " + this.userid);
        } else {
            this.isLoggedIn = false;
            throw new LoginFailedException("Login user " + this.userid + " gagal, telah gagal login " + (LoginFailedException.getFailedCounter(this.userid) + 1) 
                    + " kali", this.userid);
        }
    }
}
