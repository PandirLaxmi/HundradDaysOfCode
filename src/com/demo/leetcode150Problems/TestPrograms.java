package com.demo.leetcode150Problems;

public class TestPrograms {
    public static void main(String[] args) {
        question1();
    }
    public static void question9(String a){
        a = "xyz";
    }
    public static void question8(){
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2);
    }
    public static void question7(){
        String s = "Hello";
        int i = 10;
        int j = 20;

        System.out.println(s + i * j);
        //System.out.println(s + i - j);
    }
    public static void question6(){
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 4; j++) {
                i = i  % j;
                System.out.println(j);
            }
        }
    }
    public static void question5(){
    }
    public static void question4(){
        /*
        * 7. Which statements are true in Java?
                A class can extend more than one class
                A class can extend only one class but can extend many interfaces.
                An interface can extend many interfaces
                An interface can implement many interfaces
                A class can extend one class but can implement many interfaces
                */
    }
    public static void question3(){

        /*
        * How to find out length of the 1D array?*
            array.length
            array.findLength()
            --array.length()
            array.size()

        * */
    }
    public static void question2(){
        /*Which statements are true in Java?
            Local variables must be initialized before use
            Constructor is used to initialize the class variable
            When we have two methods with the same name in the same class with different parameters called method overloading
            We cannot create object of abstract class
            We can have constructor inside the interface
        *
        * */

    }
    public static void question1(){
        //Write a program to print sum of each digits from the given number Example Input - 45645
        int num = 648983274;
        int sum = 0;
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println(sum);
    }
}
