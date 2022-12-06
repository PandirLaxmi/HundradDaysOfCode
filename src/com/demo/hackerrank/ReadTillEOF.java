package com.demo.hackerrank;

import java.util.Scanner;

public class ReadTillEOF {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int count = 0;
        while(input.hasNextLine()){
            System.out.println(++count + " " + input.nextLine());
        }
        input.close();

    }
}
