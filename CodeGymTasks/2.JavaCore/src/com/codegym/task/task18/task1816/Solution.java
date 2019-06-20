package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        String fileName = args[0];
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int count = 0;
            String input;
            while ((input = reader.readLine()) != null) {
                for (char ch : input.toCharArray()) {
                    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                        count++;
                    }
                }
            }
            System.out.println(count);
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
