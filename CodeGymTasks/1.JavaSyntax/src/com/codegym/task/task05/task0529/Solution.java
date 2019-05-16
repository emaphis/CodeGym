package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true)
        {
            String str = buffer.readLine();
            if (str.equals("sum"))
                break;
            sum += Integer.parseInt(str);
        }
        System.out.println(sum);
    }
}
