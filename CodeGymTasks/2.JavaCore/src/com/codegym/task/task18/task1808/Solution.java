package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());

        int size = inputStream.available();
        int half = size % 2 == 0 ? size / 2 : size / 2 + 1;

        while (inputStream.available() > 0) {
            byte[] buffer1 = new byte[half];
            byte[] buffer2 = new byte[size - half];

            inputStream.read(buffer1);
            inputStream.read(buffer2);

            outputStream1.write(buffer1);
            outputStream2.write(buffer2);
        }

        reader.close();
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
