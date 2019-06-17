package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> set = new HashSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(file);
        while (inputStream.available() > 0) {
            int chr = inputStream.read();
            set.add(chr);
        }
        inputStream.close();

        List<Integer> sorted = new ArrayList(set);
        Collections.sort(sorted);

        for (int chr : sorted) {
            System.out.print(chr + " ");
        }
    }
}
