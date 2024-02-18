package com.demo.leetcode150Problems;

public class removeDuplicate2 {
    public static void main(String[] args) {
        /*Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each
        unique element appears at most twice. The relative order of the elements should be kept the same.
        Return k after placing the final result in the first k slots of nums.*/
        int[] nums = {1,1,1,2,2,2,4,4,5,6,7,8,8,9};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int temp = 1;
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] == nums[i-1] && temp == 1){
                nums[count++] = nums[i];
                temp = 0;
            }
            else if(nums[i] != nums[i-1]){
                nums[count++] = nums[i];
                temp = 1;
            }
        }
        return count;
    }
}
