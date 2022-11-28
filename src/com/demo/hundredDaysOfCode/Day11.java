package com.demo.hundredDaysOfCode;

public class Day11 {
    public static void main(String[] args) {
        /*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
        Note that you must do this in-place without making a copy of the array.*/
        int[] nums = {0,1,3,0,11,0};
        int temp;
        //bubble sort algorithm
        for(int i = 0; i < nums.length-1; i++){
            for (int j = 0; j < nums.length - i - 1; j++)
                if(nums[j]==0){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            System.out.println(nums[i]);
        }
    }
}
