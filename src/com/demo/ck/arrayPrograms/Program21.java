package com.demo.ck.arrayPrograms;

public class Program21 {
    public static void main(String[] args) {
        //write a program to find smallest number from the array
        /*int[] arr = {43,65,65,45,34};
        int a = Arrays.stream(arr).min().orElseThrow(NoSuchElementException::new);
        System.out.println(a);*/
        int[] numbers = {43,65,65,45,34};
        int smallest = numbers[0];
        for (int i : numbers) {
            if (i < smallest) {
                smallest = i;
            }
        }
        System.out.println(smallest);
    }

}
