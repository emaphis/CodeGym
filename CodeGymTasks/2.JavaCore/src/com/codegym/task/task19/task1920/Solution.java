package com.codegym.task.task19.task1920;

/* 
The richest

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        Map<String, Double> map = new TreeMap<>();
        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] record = line.split(" ");
            String name = record[0];
            double wage = Double.parseDouble(record[1]);

            if (map.containsKey(name)) {
                double totalWage = map.get(name);
                totalWage += wage;
                map.replace(name, totalWage);
            } else {  // add new
                map.put(name, wage);
            }
        }
        fileReader.close();

        // find max wage
        Double max = 0.0;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (max.compareTo(entry.getValue()) == 0) {
                System.out.println(entry.getKey());
            }
        }
    }
}
