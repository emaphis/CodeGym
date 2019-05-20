package com.codegym.task.task07.task0714;

import java.awt.image.BufferStrategy;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Words in reverse

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // read 5 strings
        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            list.add(str);
        }

        // remove third (2) element
        list.remove(2);

        // print in reverse
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}


