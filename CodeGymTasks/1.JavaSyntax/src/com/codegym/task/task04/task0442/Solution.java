package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        int accum = 0;
        while (num != -1) {
            num = Integer.parseInt(reader.readLine());
            accum += num;
        }
        System.out.println(accum);
    }
}
