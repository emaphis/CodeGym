package com.codegym.task.task19.task1907;

/* 
Counting words

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        int count = 0;
        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] words = line.split("\\W");
            for (String word : words) {
                if (word.equals("world")) {
                    count++;
                }
            }
        }
        fileReader.close();

        System.out.println(count);
    }
}
