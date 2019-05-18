package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] large = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];

        for (int i = 0; i < large.length; i++) {
            large[i] = Integer.parseInt(reader.readLine());
        }

        // fill small arrays
        for (int i = 0; i < small1.length; i++) {
            small1[i] = large[i];
        }

        for (int i = 0; i < small2.length; i++) {
            small2[i] = large[small1.length + i];
        }

        // print second array
        for (int i = 0; i < small2.length; i++) {
            System.out.println(small2[i]);
        }
    }
}
