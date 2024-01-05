package com.demo.ck.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a Map
        Map<String, String> myMap = new HashMap<>();

        // Adding key-value pairs
        myMap.put("name", "Ram");
        myMap.put("age", "30");
        myMap.put("city", "Pune");

        // Getting values by key
        System.out.println(myMap.get("name")); // Output: John

        // Checking if a key exists
        System.out.println(myMap.containsKey("age")); // Output: true

        // Iterating over key-value pairs
        for (Map.Entry<String, String> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing a key-value pair
        myMap.remove("city");
    }
}
