package com.demo.ck.class24;

public class PhoneRepairShop {


    //Not good approach as if there are 100 types of phone then we will have to create 100 methods for the repair
    // rather we will create one method for repair that will take phone as parameter and then will call the respective methods of the
    // phone child class
    /*void repair(Android android){
        android.repair();
    }
    void repair(Iphone iphone)
    {
        iphone.repair();
    }*/

    void repair(Phone phone){
        phone.repair();
    }
}
