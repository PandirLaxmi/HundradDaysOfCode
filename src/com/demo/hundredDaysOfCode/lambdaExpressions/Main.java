package com.demo.hundredDaysOfCode.lambdaExpressions;

public class Main {
    public static void main(String[] args) {
        SumInterface sumInterface = (int a , int b) -> {
            return a + b;
        };

        SumInterface sumInterface1 = (a, b ) -> a+b;

        System.out.println(sumInterface.sum(6, 7));
        sumInterface1.sum(5,7);


        LengthInter lengthInter = (str) -> str.length();

        System.out.println("length of the string is " + lengthInter.getLength("this is me"));
    }
}
