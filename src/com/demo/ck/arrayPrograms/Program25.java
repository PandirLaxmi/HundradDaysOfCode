package com.demo.ck.arrayPrograms;

public class Program25 {
    public static void main(String[] args) {
        //Write a Java program to find the length of the longest consecutive elements sequence from the array
        int[] numbers = {3, 5, 4, 7,10,  8, 11, 9,};
                //{3, 4, 7, 8, 9, 10, 43, 45, 46, 47, 9};
        int count = 1;
        int temp = 1;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] +1 == numbers[i+1]) {
                temp++;
            }
            else {
                temp =1 ;
            }
            if (temp > count) {
                count = temp;
            }
        }
        System.out.println(count);
    }
}
