package com.codegym.task.task19.task1927;

/* 
Contextual advertising

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream saveConsole = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream console = new PrintStream(byteArrayOutputStream);
        System.setOut(console);

        testString.printSomething();
        System.setOut(saveConsole);

        String output = byteArrayOutputStream.toString();
        String[] lines = output.split("\n");
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
            if ((i+1) % 2 == 0) {  // every third line
                System.out.println("CodeGym - online Java courses ");
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
