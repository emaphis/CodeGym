package com.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String str = reader.readLine();
            if (str.equals("end"))
                break;
            list.add(str);
        }

        for (String str : list) {
            System.out.println(str);
        }
    }
}