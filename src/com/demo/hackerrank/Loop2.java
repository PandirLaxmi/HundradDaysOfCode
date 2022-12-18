package com.demo.hackerrank;

import java.util.*;

public class Loop2 {
    public static void main(String []argh){
        //sum of an AP
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int k = 0; k < n; k++) {
                int result = a;
                for (int j = 0; j <= k; j++) { //a + 2^n*b
                    result = result + (int) Math.pow(2, j) * b;
                }
                System.out.printf("%1$s ", result);
            }
            System.out.println();
        }
        in.close();
    }
}
