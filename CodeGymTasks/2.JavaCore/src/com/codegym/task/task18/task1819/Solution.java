package com.codegym.task.task18.task1819;

/* 
Combining files

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            reader.close();

            FileInputStream inputStream1 = new FileInputStream(fileName1);
            byte[] buffer1 = new byte[inputStream1.available()];
            inputStream1.read(buffer1);

            FileOutputStream outputStream = new FileOutputStream(fileName1);
            FileInputStream inputStream2 = new FileInputStream(fileName2);
            byte[] buffer2 = new byte[inputStream2.available()];
            inputStream2.read(buffer2);

            byte[] outBuffer = new byte[buffer1.length + buffer2.length];
            for (int i = 0; i < buffer2.length; i++) {
                outBuffer[i] = buffer2[i];
            }
            int totalLength = buffer1.length + buffer2.length;
            for (int i = buffer2.length; i < totalLength; i++) {
                outBuffer[i] = buffer1[i - buffer2.length];
            }
            outputStream.write(outBuffer);

            inputStream1.close();
            inputStream2.close();
            outputStream.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }
}
