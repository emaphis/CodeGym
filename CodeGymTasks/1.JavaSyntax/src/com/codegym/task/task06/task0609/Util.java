package com.codegym.task.task06.task0609;

/* 
Distance between two points

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write your code here
        int x = x1 - x2;
        int y = y1 - y2;
        return Math.sqrt(x*x + y*y);
    }

    public static void main(String[] args) {

    }
}
