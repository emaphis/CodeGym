package com.codegym.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) {
        //System.out.println(isDateOdd("JANUARY 1 2000"));
        //System.out.println(isDateOdd("JANUARY 2 2020"));
        System.out.println(isDateOdd("MAY 1 2013"));
        //System.out.println(isDateOdd("MAY 2 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date compareDate = new Date(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(compareDate);
        int days = cal.get(Calendar.DAY_OF_YEAR);

        return !(days % 2 == 0);
    }
}
