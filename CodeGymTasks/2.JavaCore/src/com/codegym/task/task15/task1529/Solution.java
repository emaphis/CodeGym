package com.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Mastering the static block

*/

public class Solution {
    public static void main(String[] args) {
        result.fly();
    }
    
    static {
        //write your code here
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //write your code here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            if (input.equals("helicopter")) {
                result = new Helicopter();
            } else if (input.equals("plane")) {
                int num = Integer.parseInt(reader.readLine());
                result = new Plane(num);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
