/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1;

/**
 *
 * @author farie
 */
import java.util.Scanner;
public class TP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan n : ");
        int n = scanner.nextInt();
        
        if (n > 0) {
            Fibonacci fibonacci = new Fibonacci();
            fibonacci.printFibonacci(n);
        } else {
            System.out.println("Masukkan angka yang lebih besar dari 0.");
        }
    }
}
