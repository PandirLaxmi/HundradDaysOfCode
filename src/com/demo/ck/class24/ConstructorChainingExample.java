package com.demo.ck.class24;


class Vehicle{
    Vehicle(){
        System.out.println("from parent");
 }
}
class Car extends Vehicle{
    Car(){
        System.out.println("from child");
    }
}

class SportsCar extends Car{
    SportsCar(){
        System.out.println("from grand child");
    }
}
public class ConstructorChainingExample {
    public static void main(String[] args) {
        SportsCar sp = new SportsCar();
    }
}
