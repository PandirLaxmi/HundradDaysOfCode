package com.demo.ck.arrayPrograms;

public class Program29 {
    public static void main(String[] args) {
        //Write a program to print sum of each column of 2D array
        int[][] numbers =  {{1, 5, 6}, //[1 5] [{i,j} {}]
                            {2, 3, 7}};//[2 3] [ ]
        int rows = numbers.length;
        int columns = numbers[0].length;
        for (int i = 0; i < columns; i++) { //column
            int columnSum = 0;
            for (int j = 0; j < rows; j++) {  //rows
                columnSum += numbers[j][i];
            }

            System.out.println(columnSum);
        }

    }
}
