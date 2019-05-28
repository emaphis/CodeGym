package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        try {
            while (true) {
                int num = Integer.parseInt(reader.readLine());
                list.add(num);
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            for (int num : list) {
                System.out.println(num);
            }
        }
    }
}
