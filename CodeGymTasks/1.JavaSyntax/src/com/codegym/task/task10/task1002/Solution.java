package com.codegym.task.task10.task1002;

/* 
Task No. 2 about integer type conversions

*/

public class Solution {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / (float) b;
        double d = a * 1e-3 + c;

        //System.out.println("a: " + a + " b: " + b + " c: "+ c +" d: " + d);
        System.out.println(d);
        // d = 3.765
    }
}
