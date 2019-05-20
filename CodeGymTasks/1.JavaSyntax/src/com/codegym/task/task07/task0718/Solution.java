package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int len = 0;

        // read in strings
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        // check lengths
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.length() <= len) {
                System.out.println(i);
                break;
            }
            len = str.length();
        }
    }
}

