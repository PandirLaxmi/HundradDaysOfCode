package com.demo.geeksforGeeks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr, 6));

    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> arrList =  new ArrayList<>();
        Integer max = arr[n-1];
        arrList.add(max);
        for(int i= n-2; i >= 0 ; i--){
            if(arr[i] >= max){
                max = arr[i];
                arrList.add(arr[i]);
            }
        }
        Collections.reverse(arrList);
        return arrList;
    }
}
