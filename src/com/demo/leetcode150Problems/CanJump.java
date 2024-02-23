package com.demo.leetcode150Problems;

public class CanJump {
    /*
    * You are given an integer array nums. You are initially positioned at the array's first index,
    * and each element in the array represents your maximum jump length at that position.
    * Return true if you can reach the last index, or false otherwise.
 */
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,1,0,0};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        for(int i = 0 ; i < nums.length; ){
            if(i==nums.length-1){
                return true;
            }
            else if(i >= nums.length || nums[i] == 0){
                return false;
            }
            else{
                i = i + nums[i];
            }
        }
        return true;
    }
}
