package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        if (num > 0) {
            System.out.print("Positive");
            checkEven(num);
        } else if (num < 0) {
            System.out.print("Negative");
            checkEven(num);
        } else
            System.out.println("Zero");
    }

    static void checkEven(int num) {
        if (num % 2 == 0)
            System.out.println(" even number");
        else
            System.out.println(" odd number");
    }
}
