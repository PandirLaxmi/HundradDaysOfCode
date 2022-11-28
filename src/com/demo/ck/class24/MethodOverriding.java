package com.demo.ck.class24;


class Bank{
    void displayRateOfInterest(){
        System.out.println("roi is 6%");
    }
}

class CitiBank extends Bank{

}

class ChaseBank extends Bank{
    void displayRateOfInterest(){
        System.out.println("roi is 5%");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Bank cb = new ChaseBank();
        cb.displayRateOfInterest();
    }
}
