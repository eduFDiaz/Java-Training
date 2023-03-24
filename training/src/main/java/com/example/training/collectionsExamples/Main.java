package com.example.training.collectionsExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        list();
        set();
        map();
    }

    private static void map() {
        HashMap<String, String> names = new HashMap<String, String>();
        names.put("Alice","Ferguson");
        names.put("Bob","Fernandez");
        names.put("Charlie","Hebdoo");

        for(Map.Entry<String, String> set: names.entrySet()) {
            System.out.println(set.getKey() + " "
            + set.getValue());
        }
    }

    private static void set() {
                Set<String> hashSet = new HashSet<String>();
  
                hashSet.add("Alice");
                hashSet.add("Eduardo");
                hashSet.add("Alice");
                hashSet.add("Frank");
                hashSet.add("Frank");
                System.out.println(hashSet);
    }

    private static void list() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
