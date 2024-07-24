package com.demo.leetcode150Problems;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","floght"}));
    }
    public static int longestCommonPrefix(String[] strs ){
        int l = 0;
        int count = 0;
        boolean flag= true;
            for (String str: strs){
                while(flag){

                }
                if(!flag)
                    return count;
                if (str.length() <= count){
                    return count;
                }
                if(str.charAt(l) != strs[0].charAt(l)){

                    return count;
                }
                else count++;
                l++;
            }
        return count;
    }
}
