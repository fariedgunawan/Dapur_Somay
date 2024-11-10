/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_mod9;

/**
 *
 * @author farie
 */
public class Tube extends Circle implements HasVolume {
    private double height;

    public Tube(double height, double radius) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI  * 10 * (radius + height);
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * height * 10;
    }
}
