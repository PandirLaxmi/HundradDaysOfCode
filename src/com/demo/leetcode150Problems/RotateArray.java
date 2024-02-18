package com.demo.leetcode150Problems;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {3,5,6,8,7,9,0,3,1};
        int[] sol = rotate(nums, 3);
        for (int n : sol) {
            System.out.println(n);
        }
    }
    public static int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] sol = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                sol[i] = nums[nums.length - k + i];
            } else {
                sol[i] = nums[i - k];
            }
        }
        return sol;
    }
}
