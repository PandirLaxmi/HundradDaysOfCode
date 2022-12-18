package com.demo.hackerrank;

import java.util.Scanner;

public class StringToken {
    // Given a string s, matching the regular expression [A-Za-z !,?._'@]+ split the string into tokens. We define a
    // token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by
    // each token on a new line.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s.trim().isEmpty()) {
            System.out.println(0);
        }
        else
        {
            String[] sarr = s.trim().split("[\\s\\? \\!\\,\\.\\_\\'\\@]+");
            System.out.println(sarr.length);
            for (String st : sarr) {
                System.out.println(st);
            }
        }
        scan.close();
    }
}
