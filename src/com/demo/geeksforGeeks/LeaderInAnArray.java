package com.demo.geeksforGeeks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2, 1};  //fina the number in descending order which comes after only the large numbers
        System.out.println(leaders(arr, arr.length)); // solution will be {17, 5, 2} as it is a ladder

    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> arrList =  new ArrayList<>(); //array list is a collection
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
