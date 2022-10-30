package com.demo.hundredDaysOfCode;

import java.util.HashMap;
import java.util.Map;

public class Day3RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int amount = 0;
        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");
        Map<Character , Integer> roamn = new HashMap<>();
        roamn.put('V',5);
        roamn.put('I',1);
        roamn.put('L',50);
        roamn.put('D', 500);
        roamn.put('C',100);
        roamn.put('X',10);
        roamn.put('M',1000);
        for (int i = 0; i < s.length(); i++){
            amount = amount + (roamn.get(s.charAt(i)));
        }
        System.out.println(amount);
    }
}