package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here
        int num1 = number / 100;
        int rem1 = number % 100;
        int num2 = rem1 / 10;
        int num3 = rem1 % 10;
        return num1 + num2 + num3;
    }
}