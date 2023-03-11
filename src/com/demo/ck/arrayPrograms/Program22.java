package com.demo.ck.arrayPrograms;

public class Program22 {
    public static void main(String[] args) {
        //Write a program to move all 0's to the end of the array. Maintain the relative order of non-zero elements as well
        int[] numbers = {54, 45, 23, 0, 54, 23, 0, 76 };
        int count =0;
        /*
        //Approach 1: duplicate array
        int[] finalArray = new int[numbers.length];
        for (int number : numbers) {
            if(number != 0){
                finalArray[count++] = number;
            }
        }
        for (int k :
                finalArray) {
            System.out.println(k);
        }*/

        //using while loop
        /*
        while(i < numbers.length){
            if(numbers[i] != 0){
                finalArray[j] = numbers[i];
                j++;
            }
            i++;
        }*/

        // Approach 2:  in one array
        for (int number : numbers) {
            if (number != 0) {
                numbers[count++] = number;
            }
        }
        while(count < numbers.length){
            numbers[count++] = 0;
        }
        for (int i : numbers) {
            System.out.println(i);
        }


    }
}
