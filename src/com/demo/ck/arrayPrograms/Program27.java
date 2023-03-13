package com.demo.ck.arrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program27 {
    public static void main(String[] args) {
        //Write a Java program to create all possible permutations of a given array of distinct integers: WIP
        int[] numbers = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        permutations(0, numbers, result);
        result.forEach(System.out::println);
    }


    static void permutations(int l, int[] numbers, List<List<Integer>> res) {
        if (l == numbers.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int n : numbers) {
                list.add(n);
            }
            res.add(list);
        } else {
            for (int i = l; i < numbers.length; i++) {
                swap(l, i, numbers);
                permutations(l + 1, numbers, res);
                swap(l, i, numbers);
            }
        }
        //System.out.println(res);
    }
    public static void swap(int l, int h, int[] numbers){
        int temp = numbers[l];
        numbers[l] = numbers[h];
        numbers[h] = temp;
    }
}
