package com.codegym.task.task06.task0612;

/* 
Calculator

*/

public class Calculator {
    public static int plus(int a, int b) {
        //write your code here
        int num = a + b;
        return num;
    }

    public static int minus(int a, int b) {
        //write your code here
        int num = a - b;
        return num;
    }

    public static int multiply(int a, int b) {
        //write your code here
        int num = a * b;
        return num;
    }

    public static double divide(int a, int b) {
        //write your code here
        double num = (double) a / b;
        return num;
    }

    public static double percent(int a, int b) {
        //write your code here
        double num = b * ((double) a / 100.0);
        return num;
    }

    public static void main(String[] args) {

    }
}