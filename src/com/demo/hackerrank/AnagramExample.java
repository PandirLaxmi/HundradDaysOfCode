package com.demo.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramExample {
    static boolean isAnagram(String a, String b) {
        // Two strings,  a and b, are called anagrams if they contain all the same characters in the same frequencies.
        // For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
        /*StringBuilder sbA = new StringBuilder(a);
        if(sbA.reverse().toString().equals(b))*/
        char[] ca = a.toLowerCase().toCharArray();
        char[] cb = b.toLowerCase().toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        if(Arrays.equals(ca,cb)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
