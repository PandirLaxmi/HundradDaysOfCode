package com.demo.ck.arrayPrograms;

public class Program29 {
    public static void main(String[] args) {
        //Write a program to print sum of each column of 2D array
        int[][] numbers =  {{1, 5}, //[1 5] [{i,j} {}]
                            {2, 3}};//[2 3] [ ]

        for (int i = 0; i < numbers.length; i++) { //column
            int columnSum = 0;
            //int rowSum =0;
            for (int j = 0; j < numbers[i].length; j++) {  //rows
                /*System.out.print(numbers[i][j]);
                System.out.print(" ");
                rowSum += numbers[i][j];*/
                columnSum += numbers[j][i];
            }

            System.out.println(columnSum);
            //System.out.println(rowSum);
        }

    }
}
