package com.demo.hundredDaysOfCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day6duplicate2 {
    public static void main(String[] args) {
        //Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the
        // array such that nums[i] == nums[j] and abs(i - j) <= k.
        int[] nums= {1,2,3,1,2,3,2,3};
        int k =2;
        //Output: true
        //Bad code for large number of data
        boolean result = false;
        /*for (int i = 0; i < nums.length; i++) {  //{1,2,3,1}
            for (int j = i+1; j < nums.length-1; j++) {
                if (nums[i] == nums[j] && Math.abs(i-j)<=k) {
                    result=true;
                }
            }
        }*/
        /*for (int i = 1; i < nums.length; i++) {  //{1,2,3,1}
            for (int j = Math.max(0, i - k); j < i; j++) {
                if (nums[i] == nums[j]) {
                    result=true;
                }
            }
        }*/
       /* Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k)
                result= true;
            map.put(nums[i], i);
        }
        System.out.println(result);*/
        System.out.println(containsNearbyDuplicate(nums, k));
    }
    static public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) set.remove(nums[i - k - 1]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}

