package com.demo.ck.class10;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        //Task 1. Write a program to print a table of 5
        /*System.out.println("Enter the number for the table: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println( num + " * " + i +" = " + i * num);
        }*/
        //Task 2. Write a program to print numbers from 1 to 20 which are divisible by 3
        for (int i = 1; i <= 20 ; i++) {
            if ( i%3 == 0) {
                System.out.println(i);
            }
        }
    }
}
