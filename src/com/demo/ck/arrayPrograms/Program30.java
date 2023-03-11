package com.demo.ck.arrayPrograms;

public class Program30 {
    public static void main(String[] args) {
        //Write a program to find occurence of an element of 2D array
        int[][] matrix = {{1,4,2,8}, {5,4,7,8}, {8,4,6,9}};
        int num = 4;
        int count = 0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == num )
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
