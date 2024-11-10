/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_mod9;

/**
 *
 * @author farie
 */
public class Cube extends Square implements HasVolume {

    public Cube(double side) {
        super(side);
    }

    @Override
    public double getArea() {
        return 6 * length * length;
    }

    @Override
    public double getVolume() {
        return length * length * length;
    }
}
