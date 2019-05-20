package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here

        ArrayList<String> copy = new ArrayList<>();
        for (String word : list) {
            if (word.contains("l") & word.contains("r")) {
                copy.add(word);
            }
            if (word.contains("l") & !word.contains("r")) {
                copy.add(word);
                copy.add(word);
            }
            if (!word.contains("l") & !word.contains("r")) {
                copy.add(word);
            }
        }
        return copy;
    }

}