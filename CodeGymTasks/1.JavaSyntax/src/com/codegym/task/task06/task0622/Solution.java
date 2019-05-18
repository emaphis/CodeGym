package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        int[] nums = new int[5];
        nums[0] = Integer.parseInt(reader.readLine());
        nums[1] = Integer.parseInt(reader.readLine());
        nums[2] = Integer.parseInt(reader.readLine());
        nums[3] = Integer.parseInt(reader.readLine());
        nums[4] = Integer.parseInt(reader.readLine());

        Arrays.sort(nums); // lol. cheating

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
