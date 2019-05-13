package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num > 0) {
            System.out.println(num * 2);
        } else if (num == 0) {
            System.out.println(0);
        } else {
            System.out.println(num + 1);
        }

    }

}