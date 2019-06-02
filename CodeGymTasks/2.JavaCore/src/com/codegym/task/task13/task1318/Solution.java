package com.codegym.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        //String cwd = System.getProperty("user.dir");
        //System.out.println(cwd);

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            FileInputStream fileInputStrean = new FileInputStream(fileName);
            InputStreamReader inputReader = new InputStreamReader(fileInputStrean);
            BufferedReader fileReader = new BufferedReader(inputReader);

            while (fileReader.ready()) {
                String line = fileReader.readLine();
                System.out.println(line);
            }

            fileReader.close();
            inputReader.close();
            fileInputStrean.close();
            reader.close();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}