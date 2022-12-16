package com.demo.ck.class25;

import java.util.Scanner;

class Browser{
    void openNewIncognitoWindow(){
        System.out.println("ctrl + T");
    }
}

class Chrom extends Browser{
    void openNewIncognitoWindow(){
        System.out.println("Ctrl + Shift + N");
    }
}

class FireFox extends Browser{
    void openNewIncognitoWindow(){
        System.out.println("Ctrl + Shift + P");
    }
}

public class DynamicPolyExampleJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String browser = sc.nextLine();
        Browser b;
        if(browser.equals("chrom")){
            b = new Chrom();
        }
        else {
            b = new FireFox();
        }
        b.openNewIncognitoWindow();
    }

}
