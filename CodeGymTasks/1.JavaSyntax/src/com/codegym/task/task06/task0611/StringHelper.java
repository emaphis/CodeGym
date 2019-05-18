package com.codegym.task.task06.task0611;

/* 
StringHelper class

*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        //write your code here
        result = multiply(s, 5);
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //write your code here
        for (int i = 0; i < count; i++) {
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Amigo", 5));
        System.out.println(multiply("Amigo"));
    }
}
