package com.codegym.task.task18.task1824;

/* 
Files and exceptions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";

        while (true) {
            try {
                fileName = reader.readLine();
                FileInputStream inputStream = new FileInputStream(fileName);
                inputStream.close();

            } catch (FileNotFoundException ex) {
                System.out.println(fileName);
                reader.close();
                break;
            }
        }
        //reader.close();
    }
}
