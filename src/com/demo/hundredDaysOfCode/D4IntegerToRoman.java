package com.demo.hundredDaysOfCode;

public class D4IntegerToRoman {
    public static void main(String[] args) {
        int num = 39;
        String[] romanNums = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            while (num >= nums[i]) {
                num = num - nums[i];
                roman.append(romanNums[i]);
            }
        }
    System.out.println(roman.toString());
    }
}
