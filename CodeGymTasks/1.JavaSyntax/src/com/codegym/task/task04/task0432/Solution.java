package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        int num = Integer.parseInt(reader.readLine());

        int count = 0;
        while (count < num) {
            System.out.println(line);
            count++;
        }
    }
}
