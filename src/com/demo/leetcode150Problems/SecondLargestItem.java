package com.demo.leetcode150Problems;

public class SecondLargestItem {
    public static void main(String[] args) {
        int[] nums = {3,5,6,8,45,654,3,6,444};
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max1){
                max1 = nums[i];
            }
        }
        for (int n : nums) {
            if(n > max2 && n < max1){
                max2 = n;
            }
        }
        System.out.println(max2);
    }
}
