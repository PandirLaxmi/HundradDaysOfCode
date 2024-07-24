package com.demo.leetcode150Problems;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println("Happy Number: " + happyNumber(7));
    }
    public static boolean happyNumber(int n){
        while(n > 3){
            n = sumOfSquareOfDigits(n);
        }
        return n==1;
    }
    public static int sumOfSquareOfDigits(int n){
        if(n<10)
            return n*n;
        n = (n%10)*(n%10) + sumOfSquareOfDigits(n/10);
        return n;
    }
}
