package com.demo.leetcode150Problems;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("0p"));
    }
    public static boolean isPalindrome(String s) {
        String palindrome = s.toLowerCase().replaceAll("[^a-z^0-9]","");
        char[] chars = palindrome.toCharArray();
        for(int i = 0; i<chars.length/2; i++){
            if(chars[i]!= chars[chars.length -i-1 ])
                return false;
        }
        return true;
    }
    public static boolean isPalindromeUsingStringBuilder(String s){
// 3ms and  43.39
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        if(sb.toString().equals(sb.reverse().toString())){
            return true;
        }
        return false;

    }
}
