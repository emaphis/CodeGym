package com.codegym.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
           try {
               String fileName = reader.readLine();
               if (fileName.equals("exit")) break;
               new ReadThread(fileName).start();
           } catch (IOException ex) {
               System.out.println(ex.toString());
           }
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            // Implement constructor body
            this.fileName = fileName;
        }
        // Implement file reading here

        @Override
        public void run() {

            try {
                FileInputStream inputStream = new FileInputStream(fileName);
                Map<Integer, Integer> map = new HashMap<>();
                while (inputStream.available() > 0) {
                    int input = inputStream.read();
                    if (map.containsKey(input)) {
                        int count = map.get(input);
                        count++;
                        map.replace(input, count);
                    } else {
                        map.put(input, 1);
                    }
                }
                inputStream.close();

                // now find max
                Map.Entry<Integer, Integer> maxEntry = null;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                        maxEntry = entry;
                    }
                }

                resultMap.put(fileName, maxEntry.getKey());
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
