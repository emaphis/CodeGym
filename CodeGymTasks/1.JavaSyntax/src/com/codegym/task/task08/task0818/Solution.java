package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //write your code here
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Frank", 1000);
        map.put("Joe", 400);
        map.put("Freddy", 2000);
        map.put("Joan", 200);
        map.put("Chrissie", 2500);
        map.put("Suzzy", 600);
        map.put("George", 100);
        map.put("Jerry", 1000);
        map.put("Lissa", 300);
        map.put("Bertha", 1500);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> entry = iterator.next();
            if (entry.getValue() < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
    //    for (Map.Entry<String, Integer> pair : map.entrySet()) {
    //        System.out.println(pair.getKey() + " - " + pair.getValue());
     //   }
    }
}