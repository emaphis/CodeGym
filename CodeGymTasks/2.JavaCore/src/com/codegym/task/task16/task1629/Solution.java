package com.codegym.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //write your code here
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //write your code here
    public static class Read3Strings extends Thread {
        private String result = "";

        @Override
        public void run() {
            try {
                String input = reader.readLine();
                result += input + " ";
                input = reader.readLine();
                result += input + " ";
                input = reader.readLine();
                result += input;
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }

        public void printResult() {
            System.out.println(result);
        }
    }

}
