package com.demo.kkDSA;

public class FunctionMethods {
    public static void main(String[] args) {
        //pass by refrence and pass by value
        //java does not support pass by reference only pass by value
        //when we pass primitive data to  the function it does not change the origin object value, eg. int char, byte, short
        //but if we pass other data type like array and update the values the original object is changec.
        int a = 1;
        int b = 2;
        swap(a, b);
        System.out.println(a + " " + b );
        int[] arr = {1, 3, 5, 6} ;
        swap2(arr); // prints original values
        System.out.println(arr[0]);  // prints 99

    }

    private static void swap(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
    }

    public static void swap2(int[] arr) {
        arr[0] = 99;
    }
}
