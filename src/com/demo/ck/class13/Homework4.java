package com.demo.ck.class13;

import java.util.Scanner;

public class Homework4 {
    //Write a program to count number of digits in given number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int noOfDigits = 0;
        while(num > 0){
            num = num/10;
            noOfDigits++;
        }
        System.out.println(noOfDigits);
        //input.close();
    }
}
