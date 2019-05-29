package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // write your code here

        // create and initialize counts array
        ArrayList<Integer> counts = new ArrayList<>(alphabet.size());
        for (int i = 0; i < alphabet.size(); i++) {
            counts.add(0);
        }

        for (String str : list) {
            for (Character ch : str.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    // get index
                    int index = alphabet.indexOf(ch);
                    int count = counts.get(index);
                    counts.set(index, ++count);
                }
            }
        }

        // print results.
        for (int i = 0; i < alphabet.size(); i++) {
            char ch = alphabet.get(i);
            int count = counts.get(i);
            System.out.println(ch + " " + count);
        }
    }

}
