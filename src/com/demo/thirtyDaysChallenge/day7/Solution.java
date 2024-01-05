package com.demo.thirtyDaysChallenge.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    //Given an array, A , of  N integers, print A's elements in reverse order as a single line of space-separated numbers.
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        //System.out.println(arr.stream().map((i)-> i+1).collect(toList()));
        //System.out.println(arr.stream().filter(i-> i%2 ==0).collect(toList()));
        Collections.reverse(arr);
        for (int  i : arr) {
            System.out.print(i);
            System.out.print(" ");
        }
        bufferedReader.close();
    }
}
