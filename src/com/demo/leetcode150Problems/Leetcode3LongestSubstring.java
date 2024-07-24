package com.demo.leetcode150Problems;

import java.util.HashSet;

public class Leetcode3LongestSubstring {
    //Given a string s, find the length of the longest substring
    // without repeating characters.
    public static void main(String[] args) {
        String s = "pwwkew";
        int maxLength= 0;
        HashSet<Character> set = new HashSet();
        int i = 0;
        int j = 0;
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, set.size());
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(set);
        System.out.println(maxLength);
    }

    //solve with hashmap as well.

    public int lengthOfLongestSubstring(String s) {
        //not working for "dvdf"
        int maxLength= 0;
        String ls = "";
        if(s.equals(" "))
            return 1;
        for(char ch : s.toCharArray()){
            if(ls.indexOf(ch) != -1){
                if(maxLength < ls.length())
                    maxLength = ls.length();
                ls = ch + "";
            }
            else{
                ls = ls + ch;
                maxLength = ls.length();
            }
        }
        return maxLength;
    }
}
