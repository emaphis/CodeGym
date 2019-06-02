package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        // create file
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            String input = "";
            while (!input.equals("exit")) {
                input = reader.readLine();
                bufferedWriter.write(input);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }

        reader.close();;
    }
}
