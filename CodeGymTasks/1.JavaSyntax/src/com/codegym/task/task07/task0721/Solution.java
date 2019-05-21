package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //write your code here
        int[] list = new int[20];
        maximum = -10000000;
        minimum =  10000000;

        // read in 20 numbers
        for (int i = 0; i < 20; i++) {
            int num = Integer.parseInt(reader.readLine());
            list[i] = num;
        }

        // find the min and the max;
        for (int i = 0; i < list.length; i++) {
            if (minimum > list[i])
                minimum = list[i];
            if (maximum < list[i])
                maximum = list[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}
