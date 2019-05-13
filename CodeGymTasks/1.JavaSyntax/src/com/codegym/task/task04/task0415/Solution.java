package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (compare(a, b ,c) && compare(a, c, b) && compare(b, c, a)) {
            System.out.println("The triangle is possible.");
        } else {
            System.out.println("The triangle is not possible.");
        }
    }

    static boolean compare (int side1, int side2, int side3) {
        return (side1 + side2) > side3;
    }
}