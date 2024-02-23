package com.demo.ck.class14;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //1. Write a program to find sum of array elements
        /*int[] a = {1 ,4 , 5 ,4, 5 , 45 , 45 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);*/
        //2. Write a program to find sum of even and odd numbers
        /*int[] a = {1 ,4 , 5 ,4, 5 , 45 , 45 };
        int even = 0;
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0) {
                even+=a[i];
            }
            else odd+=a[i];
        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);*/


       //3.  Write a program to count number of positive(consider zero also positive) and negative numbers from an array
        /*int[] a = {1 ,-4 , 5 ,4, -5 , 45 , 45 , 0};
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                positive++;
            }
            else negative++;
        }
        System.out.println("positive: " + positive);
        System.out.println("negative: " + negative);*/

        //4. Write a program to check given number is available in the array or not
        /*int[] a = {1 ,-4 , 5 ,4, -5 , 45 , 45 , 0};
        int target = 45;
        boolean result = false;
        for (int i = 0; i < a.length; i++) {
            if(target == a[i]) {
                result = true;
                break;
            }
        }
        System.out.println(result);*/

        //5.  Write a program to find sum of each row from two dimention array
        /*int[][] a = {{1,2,3},
                    {2,3,4},
                    {5,4,3}};
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int k = 0; k < a.length; k++) {
                sum+=a[i][k];
            }
            System.out.println(sum);
        }*/
        //6. Write a program to find the greatest number from two dimensional array
        int[][] a = {{1,2,3},
                    {2,13,4},
                    {5,4,3}};
        int greatestNum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (greatestNum < a[i][j]) {
                    greatestNum = a[i][j];
                }
            }
        }
        System.out.println(greatestNum);

        /* //7. find square of a given number
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(a*a);*/

    }
}
