package com.demo.ck.class24;


class Parent{
    int a = 10;
}

class Child extends Parent{
    int a = 20;
    void method1(){
        int a = 50;
        System.out.println(a); //50
        System.out.println(this.a); //20
        System.out.println(super.a);  //10
    }
}
public class ExamplesOfKeywords {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
    }
//pillers of java OOPs
    //inheritance --constructor chaining
    // -- this and super keyword
    //polymorphism
    /*-- method overloading : multiple methods in same class with same name but either different number of parameters
    or different type of parameters. not return type should be same.*/
    /*--method overriding : methods with same name in parent and child class, wiht same return type and same number of
     parameters and same data type of parameters*/
    /*-- Dynamic polymorphism/run time polymorphism
    * when we create and object of child class with reference of the parent class
    * we can call methods which are overriden in the child class only or parent class methods*/
    //encapsulation
    //abstraction
}
