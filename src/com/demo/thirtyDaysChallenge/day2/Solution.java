package com.demo.thirtyDaysChallenge.day2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int a;
        double b;
        //String str;

        /* Read and save an integer, double, and String to your variables.*/
        a = scan.nextInt();
        b = scan.nextDouble();
        System.out.print("enter a string");
        scan.nextLine();
        String str = scan.nextLine();
        System.out.println(str);
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + a);
        /* Print the sum of the double variables on a new line. */
        System.out.println(b + d);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + str);

        scan.close();
    }
}