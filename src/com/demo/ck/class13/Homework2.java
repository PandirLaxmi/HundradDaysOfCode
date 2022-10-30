package com.demo.ck.class13;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        /*
         123454321
          1234321
           12321
            121
             1
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = n; i > 0; i--) {
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
