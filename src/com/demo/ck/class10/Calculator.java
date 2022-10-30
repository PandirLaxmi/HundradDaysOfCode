package com.demo.ck.class10;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Task1: Write a Program to make a calculator which should perform addition, subtraction, multiplication and
        // division using switch statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = sc.nextInt();
        System.out.println("Please enter second number : ");
        int b = sc.nextInt();
        System.out.println("Please enter the operation ( + , - , * , / )");
        String operation = sc.next();
        int result;
        switch (operation) {
            case "+":
                result = a + b;
                System.out.println("Result is :" + result);
                break;
            case "-":
                result = a - b;
                System.out.println("Result is :" + result);
                break;
            case "*":
                result = a * b;
                System.out.println("Result is :" + result);
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result is :" + result);
                } else
                    System.out.println("denominator can not be zero");
                break;
            default:
                System.out.println("please enter a valid operation");
        }

    }
}
