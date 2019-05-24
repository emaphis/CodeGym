package com.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

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
        map.put("")
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
