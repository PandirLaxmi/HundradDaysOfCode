package com.demo.leetcode150Problems;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        String[] words= s.split(" ");
        return words[words.length -1].length();
    }
}
