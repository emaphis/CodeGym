package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int min = 10000000;
        Map<Integer,Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(file);
        while (inputStream.available() > 0) {
            int chr = inputStream.read();
            if (map.containsKey(chr)) {
                int count = map.get(chr);
                count++;
                map.put(chr, count);
            } else {
                map.put(chr, 1);
            }
        }
        inputStream.close();

        min = Collections.min(map.values());

        //System.out.println("min: " + min);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
