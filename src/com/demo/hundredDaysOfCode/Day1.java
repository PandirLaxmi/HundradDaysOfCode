package com.demo.hundredDaysOfCode;

import com.demo.ck.class9.Leetcode1;

public class Day1 {
    public static void main(String[] args) {
        /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up
         to target.*/
        int[] a = {1, 2, 3, 5, 6, 7, 8};
        int target = 12;
        int[] result = Leetcode1.twoSum(a, target);
        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
