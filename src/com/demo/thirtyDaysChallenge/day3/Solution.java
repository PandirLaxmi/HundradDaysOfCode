package com.demo.thirtyDaysChallenge.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {


    /*Task
        Given an integer, n , perform the following conditional actions:

        If n is odd, print Weird
        If n is even and in the inclusive range of 2 to 5, print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than 20, print Not Weird*/

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        boolean weird = false;

        if(N/2 != 0){
            weird = true;
        }
        else if (N/2 == 0 ){
            if (N >= 2 && N <= 5){
                weird = false;
            } else if (N >= 6 && N <= 20) {
                weird = true;
            }
            else
                weird = false;
        }
        if(weird)
            System.out.println("Weird");
        else
            System.out.println("Not Weird");

        bufferedReader.close();
    }
}

