package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] houses = new int[15];

        for (int i = 0; i < houses.length; i++) {
            houses[i] = Integer.parseInt(reader.readLine());
        }

        int even = 0;
        int odd = 0;
        for (int i = 0; i < houses.length; i++) {
            if (i % 2 == 0)
                even += houses[i];
            else
                odd += houses[i];
        }

        //System.out.println("ev:" + even + "  od: " + odd);  // temp
        if (even > odd)
            System.out.println("Even-numbered houses have more residents.");
        else
            System.out.println("Odd-numbered houses have more residents.");
    }
}
