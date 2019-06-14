package com.codegym.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //write your code here
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //write your code here
        f.join();
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    //write your code here
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private ArrayList<String> lines;

        public ReadFileThread() {
            this.lines = new ArrayList<>();
        }

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContents() {
            String output = "";
            for (String line : lines) {
                output += line + " ";
            }

            return output;
        }

        @Override
        public void run() {
            BufferedReader fileReader;

            try {
                File file = new File(fileName);
                String line;
                fileReader = new BufferedReader(new FileReader(file));
                while((line = fileReader.readLine()) != null) {
                    lines.add(line);
                }
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println(e.toString());;
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
}
