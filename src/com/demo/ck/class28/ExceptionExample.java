package com.demo.ck.class28;

public class ExceptionExample {

    /*Exception:- runtime event that will disrupt the execution of java program
    * try
    * catch
    * finally
    * throw
    * throws */
    static String str;
    public static void main(String[] args) {
        int a= 1, b=0;



        // Exception exaples
        //System.out.println(a/b); // This will result in exception, run time
        /*String str;
          System.out.println(str); */// this will result in compile time error : Variable 'str' might not have been initialized
        //System.out.println(str.length()); // This will result in run time exception: nullPointerException as default
                                          // value of string is null
    }
}
