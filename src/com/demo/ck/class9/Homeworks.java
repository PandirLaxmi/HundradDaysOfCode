package com.demo.ck.class9;

import java.util.Scanner;

public class Homeworks {
    public static void main(String[] args) {



        /*Task#2 - Write a program to calculate final bill of customer after giving appropriate discount based on the amount as follows
        If total amount equal or above 10000 then give 20% discount
        If total amount equal or above 5000 then give 15% discount
        If total amount equal of above 2000 then given 10% discount
        If total amount equal of above 1000 then given 5% discount
        If total amount less than 1000 then 0% discount*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter bill amount: ");
        int bill = sc.nextInt();
        System.out.println("enter percentage discount: ");
        int discount = sc.nextInt();
        System.out.println("Bill after discount: " + (bill - bill*discount/100));*/



        /*Task #1 -  Write a program to take marks from the user and print the grade as follows
        Mark is between 90 to 100 then print A+
                Mark is between 80 to 89 then print A
        Mark is between 70 to 79 then print B+
                Mark is between 60 to 69 then print B
        Mark is between 50 to 59 then print C+
                Mark is between 40 to 49 then print C
        Mark is below 40 then print Fail*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter marks : ");
        int marks =  sc.nextInt();
        if(marks >= 90 && marks <=100){
            System.out.println("Grade is A+");
        } else if (marks>=80 && marks< 90) {
            System.out.println("Grade id A");
        } else if (marks>=70 && marks< 80) {
            System.out.println("Grade id B+");
        } else if (marks>=60 && marks< 70) {
            System.out.println("Grade id B");
        }  else if (marks>=50 && marks< 60) {
            System.out.println("Grade id C+");
        } else if (marks>=40 && marks< 50) {
            System.out.println("Grade id C");
        } else{
            System.out.println("Fail");
        }*/

        /*switch (marks) {
            case 90:
                System.out.println("marks are 90");
                break;
            case 50 :
                System.out.println("marks are 50");
                break;
            default:
                System.out.println("please enter valid marks");
        }*/



        //Task 6. Write a program to take temperature in celsius and print convert it into fahrenheit
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature in celsius: ");
        float tempInCel = sc.nextInt();
        System.out.println("temperature in fahrenheit : " + (tempInCel*9/5+32));*/


        //Task 5. Write a program to take age from user in year and print user age in months,
        //days and hours
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        System.out.println("age in months: " + age*12);
        System.out.println("age in days: " + age*365);
        System.out.println("age in hours: " + age*365*24);*/


        //Simple calculator
        /*float result ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float a = sc.nextInt();
        System.out.print("Enter second number : ");
        float b = sc.nextInt();
        System.out.print("Enter operation : ");
        char operation = sc.next().charAt(0);
        if(operation == '+' ){
            result = a + b;
            System.out.println("Result = " + result);
        }
        else if(operation == '-'){
            result = a - b;
            System.out.println("Result = " + result);
        }
        else if (operation == '*'){
            result = a * b ;
            System.out.println("Result = " + result);
        }
        else if (operation == '/'){
            if (b != 0 ) {
                result = a / b ;
                System.out.println("Result = " + result);
            }
            else System.out.println("denominator can not be zero");
        }
        else {
            System.out.println("please enter valid operation");
        }*/


    }
}
