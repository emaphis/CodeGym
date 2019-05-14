package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.*;

public class Solution {
    static int count = 0;

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        checkPositive(num1);
        checkPositive(num2);
        checkPositive(num3);

        System.out.println(count);
    }

    static void checkPositive(int num) {
        if (num > 0)
            count++;
    }

}
