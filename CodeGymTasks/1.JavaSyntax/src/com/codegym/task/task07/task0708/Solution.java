package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String input = reader.readLine();
            strings.add(input);
            if (input.length() > max)
                max = input.length();
        }

        // print strings equal to 'max'
        for (int i = 0; i < strings.size(); i++) {
            String item = strings.get(i);
            if (item.length() == max)
                System.out.println(item);
        }
    }
}
