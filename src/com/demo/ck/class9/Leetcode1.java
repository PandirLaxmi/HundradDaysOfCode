package com.demo.ck.class9;

public class Leetcode1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up
         to target.*/
        int[] a = {1, 2, 3, 5, 6, 7, 8};
        int target = 12;
        int[] result = Leetcode1.twoSum(a, target);
        System.out.println(result[0] + " " + result[1]);
        //CK class
        /*int i;
        for (i =1 ; i<= 5; i++){
        }
        System.out.println(i);
        ***************
        int add = 0;
        for (int j=1 ; j<= 5; j++){
            add +=j;
        }
        System.out.println(add);*/
    }

    /*You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.*/
        /*public static int[] twoSum(int[] nums, int target){
            int[] output = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++)
                    if (nums[i] + nums[j] == target) {
                        output[0] = i;
                        output[1] = j;
                        return output;
                    }
            }
            return output;
        }*/

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}


