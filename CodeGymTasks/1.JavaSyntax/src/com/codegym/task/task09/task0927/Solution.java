package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //write your code here
        HashMap<String, Cat> cats = new HashMap<>();
        cats.put("fluffy", new Cat("fluffy"));
        cats.put("muffy", new Cat("muffy"));
        cats.put("buffy", new Cat("buffy"));
        cats.put("stuffy", new Cat("stuffy"));
        cats.put("puffy", new Cat("puffy"));
        cats.put("huffy", new Cat("huffy"));
        cats.put("ruffy", new Cat("ruffy"));
        cats.put("duffy", new Cat("duffy"));
        cats.put("vuffy", new Cat("vuffy"));
        cats.put("spot", new Cat("spot"));

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
