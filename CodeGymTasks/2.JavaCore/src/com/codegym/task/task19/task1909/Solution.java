package com.codegym.task.task19.task1909;

/* 
Changing punctuation marks

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
            char chr = (char)fileReader.read();
            if (chr == '.') {
                fileWriter.write('!');
            } else  {
                fileWriter.write(chr);
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
