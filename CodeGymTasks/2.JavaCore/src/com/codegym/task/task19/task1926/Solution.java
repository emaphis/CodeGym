package com.codegym.task.task19.task1926;

/* 
Mirror image

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        reader = new BufferedReader(new FileReader(fileName));

        while (reader.ready()) {
            String line = reader.readLine();
            StringBuilder builder = new StringBuilder(line);
            builder.reverse();
            System.out.println(builder.toString());
        }

        reader.close();
    }
}
