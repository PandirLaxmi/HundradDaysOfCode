package com.demo.ck.class13;

import java.util.Scanner;

public class Homework1 {
   public static void main(String[] args) {
         /*  1
            121
           12321
          1234321
         123454321*/
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
   }
}
