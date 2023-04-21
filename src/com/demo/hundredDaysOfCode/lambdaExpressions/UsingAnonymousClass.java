package com.demo.hundredDaysOfCode.lambdaExpressions;

public class UsingAnonymousClass {
    public static void main(String[] args) {
        //anonymous class for implementation of interface
        MyInterface i1 = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello from interface implementaion 1");
            }
        };
        i1.sayHello();
        MyInterface i2 = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello from interface implementaion 2");
            }
        };
        i2.sayHello();
    }
}
