package com.demo.hundredDaysOfCode;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        /*Write a program that displays an amount in rupees in terms of notes of different dominations. Eg. Rs. 2782 is displayed as :
        Rs. 2000 notes: 1
        Rs. 500 notes : 1
        Rs. 100 notes: 2
        Rs. 50 notes : 1
        Rs. 20 notes : 1
        Rs. 10 notes : 1
        Rs. 5 notes : 0
        Rs. 2 notes : 1
        Rs. 1 notes : 0*/

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount");
        int amount = sc.nextInt();
        int note500,note100, note50, note20, note10, note5, note2, note1 ;
        note500=note100= note50= note20= note10= note5= note2= note1 = 0;
        if(amount >=500){
            note500 = amount/500;
            amount -= note500*500;
        }
        if(amount >=100){
            note100 = amount/100;
            amount -= note100*100;
        }
        if(amount >=50){
            note50 = amount/50;
            amount -= note50*50;
        }
        if(amount >=20){
            note20 = amount/20;
            amount -= note20*20;
        }
        if(amount >=10) {
            note10 = amount / 10;
            amount -= note10 * 10;
        }
        if(amount >=5) {
            note5 = amount /5;
            amount -= note5 * 5;
        }
        if(amount >=2) {
            note2 = amount /2;
            amount -= note2 * 2;
        }
        if(amount >=1) {
            note2 = amount ;
        }
        System.out.println("Rs. 500 notes : " + note500);
        System.out.println("Rs. 100 notes : " + note100);
        System.out.println("Rs. 50 notes : " + note50);
        System.out.println("Rs. 10 notes : " + note10);
        System.out.println("Rs. 5 notes : " + note5);
        System.out.println("Rs. 2 notes : " + note2);
        System.out.println("Rs. 1 notes : " + note1);


        //Task1: Write a Program to make a calculator which should perform addition, subtraction, multiplication and
        // division using switch statement

    }
}
