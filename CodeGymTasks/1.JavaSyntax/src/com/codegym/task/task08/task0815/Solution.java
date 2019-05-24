package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<>();
        map.put("Fred", "James");
        map.put("James", "Fred");
        map.put("Ted", "Johns");
        map.put("Joan", "Johns");
        map.put("Ginger", "Smith");
        map.put("Janet", "James");
        map.put("Sue", "Fred");
        map.put("Sam", "Johns");
        map.put("Sherry", "James");
        map.put("Jered", "Fred");
        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //write your code here
        Iterator<Map.Entry<String,String>> itr = map.entrySet().iterator();
        int count = 0;
        while(itr.hasNext()) {
            Map.Entry<String,String> entry = itr.next();
            String value = entry.getValue();
            if (value.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        //write your code here
        Iterator<Map.Entry<String,String>> itr = map.entrySet().iterator();
        int count = 0;
        while(itr.hasNext()) {
            Map.Entry<String,String> entry = itr.next();
            String key = entry.getKey();
            if (key.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        int count = getSameFirstNameCount(map, "Charley");
        //System.out.println(count);
    }
}
