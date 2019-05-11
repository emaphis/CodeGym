package com.codegym.task.task03.task0312;

/* 
Time conversion

*/

public class Solution {
    //write your code here
    public static int convertToSeconds(int hours) {
        return hours * 60 * 60;
    }

    public static void main(String[] args) {
        //write your code here
        System.out.println(convertToSeconds(0));
        System.out.println(convertToSeconds(50));
    }
}
