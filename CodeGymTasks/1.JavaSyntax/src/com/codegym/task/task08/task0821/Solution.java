package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //write your code here
        HashMap<String, String> people = new HashMap<>();
        people.put("Stanley", "Charley");
        people.put("Jones", "Freddy");
        people.put("Smith", "Tom");
        people.put("Stanley", "Joan");
        people.put("Smith", "Freddy");
        people.put("Linville", "Larry");
        people.put("Jones", "Jerry");
        people.put("James", "James");
        people.put("Hindes", "Charley");
        people.put("James", "Jerry");

        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
