package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int count = 1;
        int longest = 1;
        int num = -111111;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                count++;
                if (count > longest) {
                    longest = count;
                }
            } else {  // current number not equal to save number
                count = 1;
                num = list.get(i);
            }
        }
        System.out.println(longest);
    }
}