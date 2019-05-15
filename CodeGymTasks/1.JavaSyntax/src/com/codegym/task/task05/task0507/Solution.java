package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));

        double sum = 0.0;
        int count = 0;
        int num = 0;

        while (true) {
            num = Integer.parseInt(reader.readLine());
            if (num == -1) break;
            sum += num;
            count++;
        }

        if (count > 0)
            System.out.println(sum / count);
    }
}

