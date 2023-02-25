package com.demo.ck.class28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
    static String str;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(str.length());
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("denominator can not be zero");
        }catch (InputMismatchException e){
            System.out.println("enter number only");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Thanks for visiting");
    }
}
