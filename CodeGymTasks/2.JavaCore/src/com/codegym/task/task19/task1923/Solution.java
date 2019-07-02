package com.codegym.task.task19.task1923;

/* 
Words with numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String inFileName = args[0];
        String outFileName = args[1];

        BufferedReader fileReader = new BufferedReader(new FileReader(inFileName));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outFileName));

        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] words = line.split(" ");

            for (String word : words) {
                //System.out.print(word + " ");
                if (word.matches(".*\\d.*")) {
                    //System.out.print(word + "** ");
                    fileWriter.write(word + " ");
                }
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}
