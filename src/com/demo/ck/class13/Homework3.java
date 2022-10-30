package com.demo.ck.class13;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        /*  1
            121
           12321
          1234321
         123454321
          1234321
           12321
            121
             1
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i-1; l > 0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int l = 1; l < i; l++) {
                System.out.print(l);
            }
            for (int k = i; k >0; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
