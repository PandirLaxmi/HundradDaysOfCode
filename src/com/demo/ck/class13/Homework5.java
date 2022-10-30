package com.demo.ck.class13;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        //Write a program to print sum of each digit from the given number
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        /*int sum = 0;
        int greatestNum = 0;
        while(num > 0){
            if(greatestNum < num%10)
                greatestNum = num%10;
            sum +=num%10;
            num = num/10;

        }
        System.out.println(sum);*/
        //Write a program to print greatest digit from the given number
        //System.out.println(greatestNum);
        //Write a program to print reverse of the given number
        /*int reverseNum = 0;
        while(num>0){
            reverseNum =  reverseNum * 10 + (num%10) ;
            num = num/10;
        }
        System.out.println(reverseNum);*/

        //convert a number to binary
        StringBuilder binaryNum =new StringBuilder();
        while(num>0){
            binaryNum.append(num%2);
            num = num/2;
        }
        System.out.println(binaryNum.reverse());

    }
}
