package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        String fileName = args[0];
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            int n1 = 0;
            int n2 = 0;
            char ch;
            while (reader.ready()) {
                ch = (char) reader.read();
                n1++;
                if (ch == ' ') {
                    n2++;
                }
            }
            reader.close();
            float ret = ((float) n2 /  n1) * 100;
            System.out.println(String.format("%.2f", ret));
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }
}
