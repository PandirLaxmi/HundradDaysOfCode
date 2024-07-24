package com.demo.leetcode150Problems;

import java.util.HashSet;

public class majorityElement {
    public static void main(String[] args) {
        /*Given an array nums of size n, return the majority element.
        The majority element is the element that appears more than n / 2 times.
        You may assume that the majority element always exists in the array.*/
        int[] nums = {3,2,3,3,2,3,6,6,2,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums){ //3,2,3,3,2,5,6
        //Boyer moore's algorithm
        /*int target = -1;
        int count=0;
        for (int num : nums) {
            if (count == 0) {
                target = num;
            }
            if(num == target){
                count++;
            }
            else
                count--;
        }
        return target;*/
        //use set to get the list of the unique numbers

        int n = nums.length/2;
        int tempNo;
        int count=0;
        int majorityElement = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int i = 0; i < set.size(); i++){
            tempNo = nums[i];
            count = 0;
            for(int j = i ; j < nums.length; j++){
                if(tempNo == nums[j]){
                    majorityElement = nums[j];
                    count++;
                }
            }
            if(count>n)
                return majorityElement;
        }return majorityElement;
    }
}