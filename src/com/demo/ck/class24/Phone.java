package com.demo.ck.class24;

public class Phone {
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
