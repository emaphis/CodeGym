package com.codegym.task.task19.task1914;

/* 
Problem solving

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        testString.printSomething();

        String result = outputStream.toString();
        String tokens[] = result.split(" ");
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[2]);
        String operator = tokens[1];
        int c = 0;

        if (operator.equals("+")) {
            c = a + b;
        }
        else if (operator.equals("-")) {
            c = a - b;
        } else if (operator.equals("*")) {
            c = a * b;
        }
        result = result.concat(String.valueOf(c));

        printStream.close();
        System.setOut(consoleStream);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

