/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.tp_mod_10;

import java.util.HashMap;

/**
 *
 * @author farie
 */
public class LoginFailedException extends Exception {
private static final HashMap<Integer, Integer> failedCount = new HashMap<>();
    private final int userid;

    public LoginFailedException(String msg, int user) {
        super(msg);
        this.userid = user;
        failedCount.put(user, failedCount.getOrDefault(user, 0) + 1);
    }

    public int getUserid() {
        return userid;
    }

    public static int getFailedCounter(int user) {
        return failedCount.getOrDefault(user, 0);
    }
}
