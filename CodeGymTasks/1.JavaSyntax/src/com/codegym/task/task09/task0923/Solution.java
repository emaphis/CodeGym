package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();

        String input = reader.readLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                if (isVowel(ch)) {
                    vowels.add(ch);
                } else {
                    consonants.add(ch);
                }
            }
        }

        for (Character ch : vowels) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for (Character ch : consonants) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}