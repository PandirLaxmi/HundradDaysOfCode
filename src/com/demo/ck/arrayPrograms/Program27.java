package com.demo.ck.arrayPrograms;

public class Program27 {
    public static void main(String[] args) {
        //Write a Java program to create all possible permutations of a given array of distinct integers: WIP
        int[] numbers = {1,2,3};
        permute(0, numbers.length-1, numbers);
    }

    public static void permute(int l, int r, int[] numbers){
        for (int i = l; i <= r; i++) {
            swap(l, r, numbers);
            permute(i, r, numbers);
            swap(l, r, numbers);
        }
    }
    public static void swap(int l, int r, int[] numbers){
        int temp = numbers[l];
        numbers[l] = numbers[r];
        numbers[r] = temp;
    }
}
