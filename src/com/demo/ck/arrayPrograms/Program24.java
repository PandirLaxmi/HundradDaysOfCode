package com.demo.ck.arrayPrograms;

public class Program24 {
    public static void main(String[] args) {
        //Write a program to find the sum of array elements except largest and smallest number from the array
        int[] numbers = {4,3,10,54,1,56,43,90, 5};
        int smallest = 0;
        int largest = 0;
        int sum = 0;
        for (int number: numbers ){
            if (number <= smallest) {
                smallest = number;
            } else if (number > largest) {
                largest = number;
            }
        }
        for (int numb : numbers) {
            sum  += numb;
        }
        sum = sum-smallest-largest;
        System.out.println(sum);
    }
}
