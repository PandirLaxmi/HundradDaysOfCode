package com.demo.ck.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(3);
        al.add(9);
        al.add(9);
        al.add(1, 54);
        //al.remove(3);
        System.out.println(al);

        // Notes: duplicates are allowed
        // ordered insertion
        // index search allowed
        //




        /*  java.lang.UnsupportedOperationException Exception
        List<String>  list = List.of("I", "hackin", "love" , "java");
        for (int i = 0; i < list.size(); i++) {
            if (i == 1) {
                list.remove(i);
            }
        }
        System.out.println(list);*/
    }



}
