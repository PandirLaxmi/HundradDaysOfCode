package com.demo.ck.arrayPrograms;

public class Program23 {
    public static void main(String[] args) {
        //Write a program to count number of odd and even number in the array (Consider zero as a positive as well)
        int[] numbers = {54, 45, 23, 0, 54, 23, 0, 76 };
        int even = 0, odd = 0;
        for (int i :
                numbers) {
            if (i % 2 == 0 ) {
                even++;
            }
            else
                odd++;
        }
        System.out.printf("even : %d, and odd: %d ", even, odd);
    }
}
