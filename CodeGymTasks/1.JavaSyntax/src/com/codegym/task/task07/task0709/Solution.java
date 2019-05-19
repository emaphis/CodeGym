package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        int min = 10000000;

        for (int i = 0; i < 5; i++) {
            String input = reader.readLine();
            strings.add(input);
            if (input.length() < min)
                min = input.length();
        }

        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            if (string.length() == min)
                System.out.println(string);
        }
    }
}
