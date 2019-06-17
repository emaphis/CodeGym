package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Maximum byte

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        int max = -10000000;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > max) {
                max = data;
            }
        }
        System.out.println(max);
        reader.close();
        inputStream.close();
    }

}
