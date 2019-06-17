package com.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Most frequent bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int max = -100000;
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
                if (count > max) {
                    max = count;
                }
            } else {
                map.put(chr, 1);
            }
        }
        inputStream.close();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
