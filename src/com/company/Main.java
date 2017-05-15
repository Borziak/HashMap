package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Object obj = new Object();
        Object obj2 = new Entry();
        HashMap<Integer, Long> hash = new HashMap<>(17);
        Integer testint = 700;
        Integer testint3 = 700;
        Long testlong = 123456789L;
        Integer testint2 = null;
        Long testlong2 = 2334523289L;
        hash.put(testint, testlong);
        MyHashMap2<Integer, Long> map = new MyHashMap2<>(500);
        hash.put(testint, testlong);
        System.out.println(hash.get(testint));
        System.out.println(hash.size());
        map.put(testint, testlong);
        map.put(testint3, testlong2);
        map.put(testint2, testlong2);
        System.out.println(map.size());
        System.out.println(map.get(null));
    }
}
