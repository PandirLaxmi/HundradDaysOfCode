package com.demo.hundredDaysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        //Given a string s, find the length of the longest substring without repeating characters.
        /*Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.*/

        Scanner input = new Scanner(System.in);
        String s = input.next();
        /*int fIndex = 0;
        int lIndex = 0;
        String subString;
        int length = 0;
        for (int i = 0 ; i< s.length(); i++) {
            for (int k = 0; k < s.length(); k++) {
                fIndex = k;
                if (s.charAt(i) == s.charAt(k)) {
                    lIndex = k;
                    subString = s.substring(i, k);
                    break;
                }
                for (int j = fIndex; j < lIndex; j++) {
                    if (s.charAt(j) == s.charAt(j)) {

                    }
                }
            }}
    */
    Map<Character, Integer> map = new HashMap<>();
    int i = 0;
    int j = 0;
    int max = 0;
        while(j < s.length()){
        map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
        if(map.size() == j - i + 1){
            max = Math.max(max, j - i + 1);
            j++;
        }
        else if(map.size() < j - i + 1){
            while(map.size() < j - i + 1){
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                i++;
            }
            j++;
        }
    }
        System.out.println(max);
    }
}

