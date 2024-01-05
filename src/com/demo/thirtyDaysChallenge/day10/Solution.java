package com.demo.thirtyDaysChallenge.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum
    number of consecutive 1's in n's binary representation. When working with different bases, it is common to show the
    base as a subscript.*/
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String binary = "";
        while(n>0){
            if(n>=0){
                binary = n%2 + binary;
                n = n/2;
            }
        }
        int temp = 0;
        int max = 0;
        for (char ch : binary.toCharArray()) {
            if(ch == '1') {
                temp++;
            }
            if (temp >= max)
                max = temp;
            if(ch == '0')
                temp= 0;

        }

        System.out.println(max);
        bufferedReader.close();
    }
}
