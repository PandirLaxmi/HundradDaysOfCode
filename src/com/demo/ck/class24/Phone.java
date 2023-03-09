package com.demo.ck.class24;

public class Phone {
    static int abc;
    Phone(int i){
        Phone.abc = i;
    }
    Phone(){
        System.out.println("in constructor");
    }
    void call(){
        System.out.println("calling");
    }

    void repair() {
        System.out.println("repairing");
    }
}

class Android extends Phone{
    @Override
    void repair(){
        System.out.println("Repairing android Phone");
    }
}

class Iphone extends Phone{
    @Override
    void repair(){
        System.out.println("repairing iPhone");

    }
}
