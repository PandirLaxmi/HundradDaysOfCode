package com.demo.ck.class27;

class Bank{

    /*
    * public : like your name
    * protected: like your salary
    * default: like society funds
    * protected:like society funds but if your child lives present in the other society then child can access the information
    * also
    */
    int balance;
    Bank(int balance){
        balance= balance;
    }
    void withdraw(int amount){
        balance =  balance -  amount;
    }
    void checkBalanc(){
        System.out.println(balance);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        //encapslation:
        Bank bank = new Bank(500);
        bank.checkBalanc();
        bank.withdraw(200);
        bank.balance = 5000000;
        bank.checkBalanc();
    }
}
