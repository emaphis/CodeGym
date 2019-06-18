package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileIn = reader.readLine();
        String fileOut = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileIn);
        FileOutputStream outputStream = new FileOutputStream(fileOut);

        while (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            byte[] bufferRev = new byte[inputStream.available()];

            inputStream.read(buffer);

            int j = buffer.length;
            for (int i = 0; i < buffer.length; i++) {
                bufferRev[j - 1] = buffer[i];
                j--;
            }
            outputStream.write(bufferRev);
        }
        reader.close();
        inputStream.close();
        outputStream.close();
    }
}
