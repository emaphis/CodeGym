package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Ceaser Cypher
 * https://www.geeksforgeeks.org/caesar-cipher/
 */

public class Solution {
    public static void main(String[] args) {
        if (args.length < 3) return;
        String command = args[0];
        String inFileName = args[1];
        String outFileName = args[2];

        try {
            FileInputStream inputStream = new FileInputStream(inFileName);
            FileOutputStream outputStream = new FileOutputStream(outFileName);
            if (command.equals("-e")) {
                while (inputStream.available() > 0) {
                    byte[] buffer = new byte[inputStream.available()];
                    inputStream.read(buffer);

                    // encrypt txt
                    for (int i = 0; i < buffer.length; i++) {
                        if (Character.isUpperCase(buffer[i]) && Character.isAlphabetic(buffer[i])) {
                            int chr = buffer[i];
                            buffer[i] = (byte) ((chr + 6 - 65) % 26 + 65);
                        } else if (Character.isLowerCase(buffer[i]) && Character.isAlphabetic(buffer[i])) {  // lower case
                            int chr = buffer[i];
                            buffer[i] = (byte)((chr + 6 - 97) % 26 + 97);
                        }
                    }

                    outputStream.write(buffer);
                }
            } else if (command.equals("-d")) {
                while (inputStream.available() > 0) {
                    byte[] buffer = new byte[inputStream.available()];
                    inputStream.read(buffer);

                    // decrypt text
                    for (int i = 0; i < buffer.length; i++) {
                        if (Character.isUpperCase(buffer[i]) && Character.isAlphabetic(buffer[i])) {
                            int chr = buffer[i];
                            buffer[i] = (byte) ((chr + 20 - 65) % 26 + 65);
                        } else if (Character.isLowerCase(buffer[i]) && Character.isAlphabetic(buffer[i])) {  // lower case
                            int chr = buffer[i];
                            buffer[i] = (byte)((chr + 20 - 97) % 26 + 97);
                        }
                    }

                    outputStream.write(buffer);
                }
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

}
