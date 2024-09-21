/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_2;

/**
 *
 * @author farie
 */

import java.util.Scanner;
public class TP1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Masukkan ukuran matriks (n x n): ");
        int n = scanner.nextInt();

        
        TP2_2 matrixOps = new TP2_2();

        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];

       
        System.out.println("Masukkan nilai untuk matrix 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

     
        System.out.println("Masukkan nilai untuk matrix 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Isi matrix 1:");
        matrixOps.printMatrix(matrix1);

     
        System.out.println("Isi matrix 2:");
        matrixOps.printMatrix(matrix2);

      
        int[][] resultMatrix = matrixOps.multiplyMatrices(matrix1, matrix2, n);
        System.out.println("Hasil perkalian:");
        matrixOps.printMatrix(resultMatrix);
    }
}
