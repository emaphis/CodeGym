package com.codegym.task.task19.task1925;

/* 
Long words

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileIn = args[0];
        String fileOut = args[1];

        BufferedReader fileReader = new BufferedReader(new FileReader(fileIn));
        List<String> list = new ArrayList<>();

        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.length() > 6) {
                    list.add(word);
                }
            }
        }
        fileReader.close();

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileOut));
        int i;

        for (i = 0; i < list.size() - 1; i++) {  // all but last
            fileWriter.write(list.get(i) + ",");
        }
        // now last
        fileWriter.write(list.get(i));

        fileWriter.close();
    }
}
