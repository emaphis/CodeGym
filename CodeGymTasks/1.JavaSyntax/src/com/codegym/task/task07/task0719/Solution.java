package com.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Display numbers in reverse order

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<Integer> list = new ArrayList<>();

        // read in 10 numbers
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        // print list in reverse order
        for (int i = list.size() -1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
    }
}
