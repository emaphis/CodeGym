package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String outFileName1 = reader.readLine();
            String inFileName2 = reader.readLine();
            String inFileName3 = reader.readLine();
            reader.close();

            FileOutputStream outputStream1 = new FileOutputStream(outFileName1);
            FileInputStream inputStream2 = new FileInputStream(inFileName2);
            FileInputStream inputStream3 = new FileInputStream(inFileName3);

            // Read file2 write to file1
            while (inputStream2.available() > 0) {
                byte[] buffer = new byte[inputStream2.available()];
                inputStream2.read(buffer);
                outputStream1.write(buffer);
            }

            // Read file3 append to file1
            while (inputStream3.available() > 0) {
                byte[] buffer = new byte[inputStream3.available()];
                inputStream3.read(buffer);
                outputStream1.write(buffer);
            }

            outputStream1.close();
            inputStream2.close();
            inputStream3.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }
}
