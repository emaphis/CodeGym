package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (true) {
            input = reader.readLine();
            if (input.equals("exit"))
                break;

            try {
                if (input.indexOf(".") > 0) {
                    Double value = Double.parseDouble(input);
                    print(value);
                } else {
                    int value = Integer.parseInt(input);
                    if (value > 0 && value < 128) {
                        print((short) value);
                    } else if (value <= 0 || value >= 128) {
                        print(value);
                    }
                }

            } catch(NumberFormatException e){
                print(input);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
