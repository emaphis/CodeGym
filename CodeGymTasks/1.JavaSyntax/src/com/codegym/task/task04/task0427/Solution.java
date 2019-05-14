package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        if (num < 1 || num > 999) return;

        if (num % 2 == 0) {
            System.out.print("even ");
            checkDigits(num);
        } else {
            System.out.print("odd ");
            checkDigits(num);
        }
    }

    static void checkDigits(int num) {
        if (num  > 99 && num < 1000) {
            System.out.println("three-digit number");
        } else if (num >  9 && num < 100) {
            System.out.println("two-digit number");
        } else if (num > 0 && num < 10) {
            System.out.println("single-digit number");
        }
    }
}
