package com.demo.leetcode150Problems;

import java.util.Arrays;
import java.util.HashSet;

public class SingleNumber {
    //Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    //You must implement a solution with a linear runtime complexity and use only constant extra space.
    public static void main(String[] args) {
        int[] numbs = {2, 2, 1};
        System.out.println(singleNumber2(numbs));
    }

    public static Integer singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet();
        //ArrayList<Integer> list = new ArrayList<>();
//brut force
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        return (Integer) set.stream().findFirst().get();
    }
    /*
    //Arrays.stream(nums).peek();
            if(set.add(nums[i])){
                if(!temp)
                singleNumber = nums[i];
            }else{
                temp = false;
                singleNumber = null;
            }
    *
    * */

    public static int singleNumber1(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }

    public static int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i+=2) {
            if(nums[i] != nums[i+1])
                return nums[i];
        }
        return -1;
    }
}

