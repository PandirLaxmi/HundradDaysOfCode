package com.demo.hackerrank;

import java.util.Scanner;

/*Given two strings of lowercase English letters,  and , perform the following operations:

1. Sum the lengths of A and B.
2. Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
3. Capitalize the first letter in A and  Band print them on a single line, separated by a space.*/

public class StringExample {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        System.out.println(A.replace(A.charAt(0), A.toUpperCase().charAt(0)) + " " +B.replace(B.charAt(0), B.toUpperCase().charAt(0)));
    }
}




