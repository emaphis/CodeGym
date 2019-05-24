package com.codegym.task.task08.task0817;

import java.util.*;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<>();
        map.put("Jones", "Eddie");
        map.put("Smith", "Billie");
        map.put("Lester", "Chester");
        map.put("Bright", "Scottie");
        map.put("Mack", "Freddie");
        map.put("Browne", "Charley");
        map.put("Vance", "Donald");
        map.put("Adams", "Smiley");
        map.put("Johnson", "Bart");
        map.put("McCoy", "Len");
        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here
        ArrayList<String> names = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            names.add(pair.getValue());
        }

        for (String name : names) {
            if (Collections.frequency(names, name) > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        //HashMap<String, String> map = createMap();
        //removeFirstNameDuplicates(map);
    }
}
