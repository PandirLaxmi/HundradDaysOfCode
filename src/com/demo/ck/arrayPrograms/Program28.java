package com.demo.ck.arrayPrograms;

public class Program28 {
    public static void main(String[] args) {
        //Write a Java program to find maximum product of two integers in a given array of integers
        int[] numbers = {1,2,3,12,4,65,9};
        int product = 0;
        for (int i = 0; i < numbers.length-1 ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
               int  temp = numbers[i] * numbers[j];
                if (temp > product ){
                    product = temp;
                }
            }
        }
        System.out.println(product);
    }
}
