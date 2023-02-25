package com.demo.hackerrank;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicateWordsReges {
    public static void main(String[] args) {
        /*remove instances of words that are repeated more than once, but retain the first occurrence of any
        case-insensitive repeated word*/
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        // \b for boundary
        //* \\w for word \\W for not words \\1 represents the first group of parenthesis and
        // ?: id not capturing group it is just a condition to select the group and not the actual values to capture
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);
        int numberOfSentences = Integer.parseInt(in.nextLine());
        while( numberOfSentences-- > 0) {
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()){
                line = line.replaceAll(matcher.group(), matcher.group(1));
            }
            System.out.println(line);
        }
    }
}
