package com.demo.thirtyDaysChallenge.day6;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /*For each String S (where ), print S's even-indexed characters, followed by a space, followed by S's odd-indexed characters.*/
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < num; i++) {
            String str = scan.nextLine();
            StringBuilder evenStr=new StringBuilder();
            StringBuilder oddStr=new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if(j%2 == 0){
                    evenStr.append(str.charAt(j));
                }
                else{
                    oddStr.append(str.charAt(j));
                }
            }
            System.out.print(evenStr + " ");
            System.out.println(oddStr);
        }
    }
}