package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file);
        int count = 0;
        int commaCode = 44;
        while (inputStream.available() > 0) {
            int input = inputStream.read();
            if (input == commaCode) {
                count++;
            }
        }
        reader.close();
        inputStream.close();
        System.out.println(count);
    }
}
