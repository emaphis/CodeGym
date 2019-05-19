package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int min = 0;
        int max = 10000000;

        // read in strings
        for (int i = 0; i < 10; i++) {
            String input = reader.readLine();
            list.add(input);
            int len = input.length();
            if (len > min)
                min = len;
            if (len < max)
                max = len;
        }

        // print the first string that is min or max
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.length() == min || str.length() == max) {
                System.out.println(str);
                break;
            }
        }
    }
}
