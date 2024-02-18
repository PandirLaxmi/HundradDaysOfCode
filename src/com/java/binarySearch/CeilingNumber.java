package com.java.binarySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        //binary search is used for majorly sorted arrays.
        int[] nums = {3,6, 9, 34,45,67,87,99};
        int target = 98;
        System.out.println(ceilingNum(0, nums.length-1, nums, target));
    }
    public static int ceilingNum(int s, int e, int[] nums, int target){
        if(s >= e){
            return nums[s];
        }
        else{
            if(target == nums[(s+e)/2]) {
                return target;
            }
            if(target > nums[(s+e)/2]){
                return ceilingNum((s+e)/2+1, e, nums, target); //ceilingNum(2, 3, nums, 33)
            }
            else{
                return ceilingNum(s,(s+e)/2, nums, target); //ceiling(0,3 ,nums, 33)
            }
        }
    }
}
