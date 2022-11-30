package com.demo.hackerrank;

import java.util.Scanner;

public class DataTypes {
    public static void main(String []argh)
    {
        //https://gist.github.com/AbdullahMagat/153b444d7f197cd197c82313f7857949
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=(Byte.MIN_VALUE) && x<=Byte.MAX_VALUE)System.out.println("* byte");
                if(x>=(Short.MIN_VALUE) && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>=(Integer.MIN_VALUE) && x<=Integer.MAX_VALUE)System.out.println("* int");
                if(x>=(Long.MIN_VALUE) && x<=Long.MAX_VALUE)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}




