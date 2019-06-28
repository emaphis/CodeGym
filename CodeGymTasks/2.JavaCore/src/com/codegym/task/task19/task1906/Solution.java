package com.codegym.task.task19.task1906;

/* 
Even characters

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader;
        String inputFile;
        String outputFile;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            inputFile = reader.readLine();
            outputFile = reader.readLine();
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
            return;
        }

        try {
            FileReader fileReader = new FileReader(inputFile);
            FileWriter fileWriter = new FileWriter(outputFile);
            int count = 0;
            while (fileReader.ready()) {
                int chr = fileReader.read();
                if (count % 2 == 1) {
                    fileWriter.write(chr);
                }
                count++;
            }
            fileReader.close();
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }
}
