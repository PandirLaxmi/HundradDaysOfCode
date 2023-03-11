package com.demo.ck.arrayPrograms;

public class Program26 {
    public static void main(String[] args) {
        //Write a Java program to find the two elements from a given array of whose sum is closer to the zero
        int[] numbers = {3, 5, 23, 54, 23, 52, 9, 99, 11, -3};

        //approach 1: find the smallest number and then the second-smallest number, and their sum will be closer to zero
        /*int smallest = numbers[0];
        int secondSmallest = numbers[0];

        //to handle the negative numbers
        for (int i = 0; i <numbers.length; i++) {
                if (numbers[i] <0 ){
                    numbers[i] *= -1; //to handle the negative numbers
                }
        }
        for (int number : numbers) {
            if (number <smallest) {
                smallest = number;
            }
        }
        System.out.println(smallest);
        for (int number : numbers) {
            if (number < secondSmallest && number != smallest){
                secondSmallest = number;
            }
        }
        System.out.println(secondSmallest);
*/
        // but it fails when the arrays contains negative numbers too. in such case we can make all elements positive and then can do the math

        //Approach 2: find the absolute value of the sum
        int minSum = numbers[0]+numbers[1];
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int tempSum = numbers[i] + numbers[j];
                if (Math.abs(tempSum) < Math.abs(minSum)){
                    num1 = numbers[i];
                    num2 = numbers[j];
                    minSum = tempSum;
                }
            }
        }
        System.out.println(num1 + "  "+ num2);
    }
}
