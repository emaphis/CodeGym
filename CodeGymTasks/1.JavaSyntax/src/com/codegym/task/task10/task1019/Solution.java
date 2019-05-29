package com.codegym.task.task10.task1019;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> index = new ArrayList<>();

        while (true) {
            String input = reader.readLine();
            if (input.equals(""))
                break;
            int id = Integer.parseInt(input);
            String name = reader.readLine();
            if (name.isEmpty())
                name = " ";
            map.put(name, id);

            if (index.contains(name)) {
                index.remove(name);
                index.add(name);

            } else {
                index.add(name);   // store name order
            }
        }

        for (String name : index) {
            System.out.println(map.get(name) + " " + name);
        }
    }
}
