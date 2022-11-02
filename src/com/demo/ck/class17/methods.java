package com.demo.ck.class17;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        fact(num);


    }
    static void fact(int num){
        for (int i = 1; i <=num ; i++) {
            if (num % i == 0)
                System.out.println(i);
        }
    }
}
