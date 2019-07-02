package com.codegym.task.task19.task1919;

/* 
Calculating salaries

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


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

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
