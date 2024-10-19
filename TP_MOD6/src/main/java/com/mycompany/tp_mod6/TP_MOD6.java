/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod6;

/**
 *
 * @author farie
 */
public class TP_MOD6 {

    public static void main(String[] args) {
        SepedaMotor sp = new SepedaMotor("Hitam");
        HandoBaet hb = new HandoBaet("Biru");
        YahamaMoi ym = new YahamaMoi("Merah");
        
        System.out.println("\nStatus Awal Sepeda Motor: ");
        sp.jalan();
        System.out.println("\nStatus Awal Hando Baet: ");
        hb.jalan();
        System.out.println("\nStatus Awal Yahama Moi: ");
        ym.jalan();
        
        
        System.out.println("\n====================");
        System.out.println("\nStatus Terbaru Sepeda Motor:");
        sp.isiTangkiFull();
        sp.jalan();
        System.out.println(sp.cekKapanHabis());

        System.out.println("\nStatus Terbaru Honda Baet:");
        hb.isiTangkiFull();
        hb.jalan();
        System.out.println(hb.cekKapanHabis());

        System.out.println("\nStatus Terbaru Yahama Moi:");
        ym.isiTangkiFull();
        ym.jalan();
        System.out.println(ym.cekKapanHabis());
        
    }
}
