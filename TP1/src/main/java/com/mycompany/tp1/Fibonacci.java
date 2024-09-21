package com.mycompany.tp1;

public class Fibonacci {
    public void printFibonacci(int n) {
        int first = 1, second = 1;

        if (n >= 1) {
            System.out.print(first + " ");
        }
        if (n >= 2) {
            System.out.print(second + " ");
        }

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

 
        System.out.println();
    }
}
