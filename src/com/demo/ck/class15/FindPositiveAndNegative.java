package com.demo.ck.class15;

public class FindPositiveAndNegative {
    public static void main(String[] args) {
        //string and string methods find number of positive and negative numbers from the array
        /*int[] numbers = {76,0 ,-45, 8, -5 };
        int countPositive = 0;
        for (int num :
                numbers) {
            if(num >= 0){
                countPositive++;
            }
        }
        System.out.println(countPositive);
        System.out.println(numbers.length-countPositive);*/

        //find the sum of all the number in a row of a 2D array
        int[][] numbers = {{3,5,6},{11,44,55 },{45,67,3}};


        for (int[] row : numbers) {
            int sum = 0;
            for (int num : row) {
                sum = sum + num;
            }
            System.out.println(sum);
        }
     }
}
