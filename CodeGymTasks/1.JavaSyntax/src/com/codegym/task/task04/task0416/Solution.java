package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double num1 = Double.parseDouble(reader.readLine());
        int rem = (int)num1 % 5;

        if (rem == 3) {
            System.out.println("yellow");
        } else if (rem == 4) {
            System.out.println("red");
        } else {
            System.out.println("green");
        }
    }
}