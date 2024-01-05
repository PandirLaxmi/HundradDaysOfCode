package com.demo.thirtyDaysChallenge.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
    You will then be given an unknown number of names to query your phone book for. For each name queried, print the
    associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for name is not found,
    print Not found instead.
    Note: Your phone book should be a Dictionary/Map/HashMap data structure.*/
    class Solution{
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            Map map = new HashMap<>();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                map.put(name, phone);
            }
            while(in.hasNext()){
                String s = in.next();
                if(map.keySet().contains(s))
                    System.out.println(s +"=" +map.get(s));
                else
                    System.out.println("Not found");
            }
            in.close();
        }
    }