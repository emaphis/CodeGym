package com.codegym.task.task09.task0919;

/* 
Dividing by zero

*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        int num = 3 / 0;  // divide by zero
        System.out.println(num);
    }

}
