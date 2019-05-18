package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // Create and populate the array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            array[i] = num;
        }

        return array;
    }

    public static int max(int[] array) {
        // Find the maximum
        int ret = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > ret)
                ret = array[i];
        }
        return ret;
    }
}
