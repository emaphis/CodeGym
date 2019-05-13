package com.codegym.task.task04.task0412;

import java.io.*;

public class Example01 {
    public static void main(String[] args) throws Exception {
        System.out.println("got here ***");
        int num = System.in.read();
        if (num > 0) {
            num = 2 * num;
            System.out.println(num);
        }
        else if (num < 0) {
            num++;
            System.out.println(num);
        }
        else
            System.out.println(num);
    }
}
