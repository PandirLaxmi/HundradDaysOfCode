package com.demo.ck.class24;


class Base{
    void  method1(){
        System.out.println("from parent");
    }
    void method3(){
        System.out.println("only in parent");
    }
}

class Derived extends Base{
    void method1(){
        System.out.println("from derived");
    }

    void method2(){
        System.out.println("child class own method");
    }
}
public class DynamicPolymorphism {
    public static void main(String[] args) {
        // case 1
        Base b= new Base();
        b.method1();

        //case 2
        Derived d = new Derived();
        d.method1(); // compile time object creation
        d.method2();

        //case 3: dynamic polymorphism
        Base bb = new Derived(); // runtime polymorphism , at run time we will get to know which object id getting
        // created and which method will be called
        bb.method1();
        bb.method3();

        //case 4
        //Derived dd = new Base();
        //referance object= new childreference
        // althogh we have reference of parent child still the object will get created of the child class
        // Invalid scenario


    }
}
