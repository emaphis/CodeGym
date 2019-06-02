package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();

            FileInputStream inputStream = new FileInputStream(fileName);
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream));
            List<Integer> list = new ArrayList<>();
            while (fileReader.ready()) {
                int num = Integer.parseInt(fileReader.readLine());
                if (num % 2 == 0) {
                    list.add(num);
                }
            }
            reader.close();
            inputStream.close();
            fileReader.close();

            Collections.sort(list); // cheat
            for (int i : list) {
                System.out.println(i);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
