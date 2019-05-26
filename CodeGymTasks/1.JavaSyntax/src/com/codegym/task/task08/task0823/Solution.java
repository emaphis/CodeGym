package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Going national
  This required internet research.
  https://stackoverflow.com/questions/11726023/split-string-into-individual-words-java
  https://stackoverflow.com/questions/3904579/how-to-capitalize-the-first-letter-of-a-string-in-java
  https://www.geeksforgeeks.org/trim-remove-leading-trailing-spaces-string-java/
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //write your code here
        String s2 = "";
        s = s.trim();
        String[] words = s.split("\\W+");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String cap = word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            s2 += cap;
        }

        System.out.println(s2);
    }
}
