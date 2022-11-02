package com.demo.hundredDaysOfCode;

public class Day8 {
    public static void main(String[] args) {
        //palindrome number
        int x = 12921;
        /*String numS = num+ "";
        StringBuilder a = new StringBuilder(num + "");
        if(numS.equals(a.reverse().toString()))
            System.out.println(true);
        else System.out.println(false);*/
        int original = x;
        int rev = 0;
        while(x>0){
            rev = x%10 + rev*10;
            x= x/10;
        }
        System.out.println(rev==original);

    }
}
