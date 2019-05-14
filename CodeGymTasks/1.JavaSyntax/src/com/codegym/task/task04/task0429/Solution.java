package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    static int positives = 0;
    static int negatives = 0;

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        checkPositive(num1);
        checkPositive(num2);
        checkPositive(num3);

        System.out.println("Number of negative numbers: " + negatives);
        System.out.println("Number of positive numbers: " + positives);
    }

    static void checkPositive(int num) {
        if (num > 0)
            positives++;
        else if (num < 0)
            negatives++;
    }
}
