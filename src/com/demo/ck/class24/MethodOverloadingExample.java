package com.demo.ck.class24;


//pillers of java OOPs
//inheritance --constructor chaining
// -- this and super keyword
//polymorphism
//-- method overloading : multiple methods in same class with same name but either different number of parameters
//or different type of parameters. not return type should be same.
//--method overriding : methods with same name in parent and child class, wiht same return type and same number of
// parameters and same data type of parameters
//encapsulation
//abstraction
/***********************************************************************/


//method overloading
//multiple methods with same name but either different types of parameter or number of parameters in same class
class AmazonAccount{
    void createAccount(String name, String email, String pass){

    }
    void createAccount(String name, int phoneNo, String pass){

    }
    void createAccount(int phoneNo, String pass){

    }
}
public class MethodOverloadingExample {
    public static void main(String[] args) {
        AmazonAccount aa = new AmazonAccount();
        aa.createAccount("Laxmi", "abc@deg.com", "pa$$");
        aa.createAccount("Laxmi", 64746328, "pa$$");
        aa.createAccount( 64746328, "pa$$");
    }
}
