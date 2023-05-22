package com.demo.ck.class15;

public class StringExaples {
    public static void main(String[] args) {
        /*String str1 = "Hello";  //String is a class and str1 is an object
        String str2 = "Hello";  //String pool
        String str3 = new String("Hello");  //
        System.out.println(str1 == str2);  //true
        System.out.println(str1 == str3);   //false*/


        //String methods
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        String str4 = " Hello Chirag! welcome to eBay";

        //1. equality of string
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));

        //2. contains
        System.out.println(str4.contains(str1));


        // 3. convert cases to string
        System.out.println(str3.toLowerCase());

        // 4. check if STring is empty
        String str5 = "";
        System.out.println(str5.isEmpty());

        // 5. length of the string

        System.out.println(str4.length());


        // 6. find character at particular index
        System.out.println(str4.charAt(2));

        // 7. find the index of a particular character

        System.out.println(str4.indexOf("!"));
    }
}
