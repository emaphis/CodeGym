package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //write your code heretri
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateFromat1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);

        String input = reader.readLine();
        Date date = dateFromat1.parse(input);

        System.out.println(dateFormat2.format(date).toUpperCase());
    }
}
