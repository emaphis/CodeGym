package com.codegym.task.task04.task0405;

/* 
Setting the number of cats

*/

public class Cat {
    private static int catCount = 0;

    public static void setCatCount(int newCatCount) {
        //write your code here
        catCount = newCatCount;
    }

    public static void main(String[] args) {
        setCatCount(1);
        setCatCount(2);
        setCatCount(3);
    }
}
