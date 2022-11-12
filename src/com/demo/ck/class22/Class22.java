package com.demo.ck.class22;


class Demo{
    int a =10; //object variable or instance variable, one memory space for each instance (object)
    static int b = 30; //class variable, there will be one memory space even there are hundreds instance for the class.
    //instance variables and static/ class variables will be set to default values if not provided,
    // but we need to initialize local-variables
    void method1(){
        //local variables are temporary, it is born in the method and die when the methods end.
        int a =  20; // local variable. this needs to be initialized (required)
        System.out.println(a);
        System.out.println(this.a); //this will give instance variable and will print 10
    }

    void method2(){
        System.out.println(a);
    }
}

class Bank{
    static int speed;
    int balance;

    void updateDate(){
        balance = 100;
    }

    void printData(){
        System.out.println(speed);
    }

    static void printData2(){
        System.out.println(speed);
        //System.out.println(balance); //non static fields can not be referenced from the static method,
        // it will result in compile time error
    }
}
public class Class22 {
    //OOPS
    public static void main(String[] args) {
        /*Demo demo = new Demo();
        demo.method1();
        demo.method2();*/

        /*Bank b1 = new Bank();
        b1.speed = 100;

        Bank b2 = new Bank();
        b2.speed = 500;

        b1.printData();*/
        Bank.speed =  100;
        Bank.speed = 500;
        Bank.printData2();  //static methods can be called using class reference without even creating and
        // instance/object of the class

    }
}
