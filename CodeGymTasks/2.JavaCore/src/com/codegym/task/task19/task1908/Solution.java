package com.codegym.task.task19.task1908;

/* 
Picking out numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inFileName = reader.readLine();
        String outFileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(inFileName));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outFileName));
        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] words = line.split(" ");
            for (String word : words) {
                try {
                    int num = Integer.parseInt(word);
                    fileWriter.write(num + " ");
                } catch (Exception ex) { }
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
