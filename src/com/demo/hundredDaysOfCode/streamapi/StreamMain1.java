package com.demo.hundredDaysOfCode.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMain1 {
    public static void main(String[] args) {
        //Q) create a list and filter all the even numbers from the list
        List<Integer> list1 = List.of(2,4,5,67,8,5,3,6,8,86);  // returns an immutable object
       // list1.add(22);
        //System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(44);
        list2.add(65);


        List<Integer>  list3 = Arrays.asList(43,54,3,65,23,66);

        List<Integer> listEven = new ArrayList<>();
        for (int i :
                list1) {
            if (i%2 == 0) {
                listEven.add(i);
            }
        }

    }
}
