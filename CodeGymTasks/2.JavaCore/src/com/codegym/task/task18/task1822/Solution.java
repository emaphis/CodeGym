package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        String line;
        while ((line = fileReader.readLine()) != null) {
            if (line.startsWith(args[0] + ' ')) {
                System.out.println(line);
                break;
            }
        }
        fileReader.close();
    }
}
