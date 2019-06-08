package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Request parser

*/

// Examples to test:
// http://codegym.cc/alpha/index.html?lvl=15&view&name=Amigo
// http://codegym.cc/alpha/index.html?obj=3.14&name=Amigo

public class Solution {
    public static void main(String[] args) {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> alerts = new ArrayList<>();

        try {
            String input = reader.readLine();
            String string = input.substring(input.indexOf("?") + 1);
            //System.out.println(string);
            String[] keys = string.split("&");

            for (int i = 0; i < keys.length; i++) {
                if (keys[i].contains("=")) {
                    int index = keys[i].indexOf('=');
                    //System.out.println(keys[i] + " - " + index);
                    String key = keys[i].substring(0, index);
                    String value = keys[i].substring(index + 1);

                    if (key.equals("obj")) {
                        alerts.add(value);
                    }

                    System.out.print(key + " ");
                } else {
                    System.out.print(keys[i] + " ");
                }
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }

        System.out.println();

        for (String str : alerts) {
            try {
                double num = Double.parseDouble(str);
                alert(num);
            } catch (NumberFormatException e) {
                alert(str);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
