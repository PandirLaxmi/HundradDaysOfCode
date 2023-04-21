package com.demo.hundredDaysOfCode.lambdaExpressions;

public class lambda1 {
    /*what is lambda
    (anonymus function)
      no name
      no modifier
      no return type*/
    // **can be used only with functional interface, function programming**
    // (functions can be called in the arguments of another function)
    // sequential and parallel execution
    //how to write lambda
    public static void main(String[] args) {
        MyInterface i = () -> System.out.println("Hello from lambda expression");
        i.sayHello();
    }
}
