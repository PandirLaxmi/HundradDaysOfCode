package com.demo.hackerrank;

import java.util.*;

public class Loop2 {
    public static void main(String []argh){
        method(); // we can not call a non static method from a static context
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

    public static boolean method(){
        int[] a = {10, 20, 30}; //local variables can't be static, we cant make them abstract and
        // can't use access specifiers, it can only be final if needed.
        try{
            System.out.println(a[2]);
            return true;
        }
        finally {
            System.out.println("End");
        }

    }
}
