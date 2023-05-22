package com.demo.thirtyDaysChallenge.day1;

import java.io.*;
import java.util.Objects;

public class SuperReducedString {
    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    /*Sample outputs
    * aaabccddd → abccddd → abddd → abd
    * baab → bb → Empty String*/

    public static String superReducedString(String s) {
        // Write your code here
        char[] charArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean match = false;
        for (int i = 0; i < charArr.length-1; i++) {
            if(match)
                continue;
            else if( charArr[i]!=charArr[i+1]){
                match = false;
                sb.append(charArr[i]);
            }
            else{
                match = true;
            }
        }
        return sb.toString().isEmpty() ? "Empty String" : sb.toString() ;
    }


}

