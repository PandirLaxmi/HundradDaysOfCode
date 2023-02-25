package com.demo.ck.class23;

class Car{
    int speed;
    void method1(int speed){
        speed = speed +100;
    }
}

class Bike{
    int speed;
    void method2(Bike honda){
        honda.speed = honda.speed +100;
    }
}


class Auto {
    int speed;
    void method3(){
        speed =  speed + 100;
    }
}
public class example1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.method1(100);
        //System.out.println(car.speed); //pass by reference, where we pass the whole object
        Bike honda = new Bike();
        Bike hero = new Bike();
        honda.speed = 200;
        hero.speed = 400;
        hero.method2(honda);
        System.out.println(honda.speed);
        /*Tractor tractor= new Tractor();
        tractor.method3();
        System.out.println(tractor.speed);*/


    }


}
