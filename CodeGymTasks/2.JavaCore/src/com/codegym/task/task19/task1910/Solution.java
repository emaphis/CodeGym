package com.codegym.task.task19.task1910;

/* 
Punctuation

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inFileName = reader.readLine();
        String outFileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(inFileName));
        StringBuilder builder = new StringBuilder();
        while (fileReader.ready()) {
            char chr = (char)fileReader.read();
            builder.append(chr);
        }
        fileReader.close();

        String output = builder.toString();
        output = output.replaceAll("\\p{Punct}|\\n","");
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outFileName));
        fileWriter.write(output);
        fileWriter.close();
    }
}
