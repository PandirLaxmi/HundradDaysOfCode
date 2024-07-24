package com.demo.leetcode150Problems;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = plusOne(new int[]{9,9});
        for (int num: nums) {
            System.out.println(num);
        }
    }

    public static int[] plusOne2(int[] digits) {
        //simplest
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public static int[] plusOne(int[] digits) {
        int length=digits.length;
        int flag = 1;
        if(digits[length-1] != 9)
        {
            digits[length-1] = digits[length-1] + flag;
            return digits;
        }
        else{
            for (int i=digits.length-1; i >= 0 ; i--) {
                if ((digits[i] + flag > 9) && (i !=0 )) {
                    digits[i] = 0;
                    flag = 1;
                } else if (i == 0 && digits[i] + flag > 9){
                    int[] result = new int[length+1];
                    result[0] = 1;
                    return result;
                } else {
                    digits[i] = digits[i] + flag;
                    return digits;
                }
            }
        }
        return digits;
    }

    public static int[] plusOne1(int[] digits) {

        long num = 0;
        for(int i = 0; i < digits.length; i++){
            num = num*10 + digits[i];
        }
        num = num+1;
        int length = 0;
        while(num > 0){
            num=num/10;
            length++;
        }
        int[] result = new int[length];
        boolean carry= false;
        for (int i = result.length - 1; i >= 0; i--) {
            if (i == 0 && carry == true) {
                result[i] = 1;
            }
            if (carry == true) {
                if (digits[i] == 9) {
                    result[i] = 0;
                } else
                    result[i] = digits[i];
                carry = false;
            }
        }
        return result;
    }
}
