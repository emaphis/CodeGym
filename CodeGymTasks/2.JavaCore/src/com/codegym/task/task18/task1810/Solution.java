package com.codegym.task.task18.task1810;

/* 
DownloadException

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream;
        String filename;

        while (true) {
            filename = reader.readLine();
            inputStream = new FileInputStream(filename);
            if (inputStream.available() < 1000) {
                inputStream.close();
                reader.close();
                throw new DownloadException();
            }
            inputStream.close();
        }

    }

    public static class DownloadException extends Exception {

    }
}
