package com.codegym.task.task14.task1421;

/* 
Singleton

*/
public class Solution {
    public static void main(String[] args) {
        //Singleton sing = new Singleton();  // private
        Singleton sing1 = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();

        //System.out.println(sing1 == sing2);
    }
}
