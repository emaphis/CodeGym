package com.codegym.task.task14.task1420;

/* 
GCD

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://beginnersbook.com/2018/09/java-program-to-find-gcd-of-two-numbers/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = 0;
        int num2 = 0;

        num1 = Integer.parseInt(reader.readLine());
        num2 = Integer.parseInt(reader.readLine());

        if (num1 <= 0 || num2 <= 0) {
            throw new Exception("Numbers must be greater than )");
        }

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

        System.out.println(num1);
    }
}
