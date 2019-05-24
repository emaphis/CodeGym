package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Charley", df.parse("JANUARY 15 1981"));
        map.put("Fred", df.parse("FEBRUARY 18 1980"));
        map.put("Joan", df.parse("MARCH 10 1981"));
        map.put("Chrissie", df.parse("APRIL 3 1981"));
        map.put("Suzzie", df.parse("MAY 1 1980"));
        map.put("Blondie", df.parse("JULY 4 1981"));
        map.put("Ace", df.parse("AUGUST 17 1980"));
        map.put("Linda", df.parse("SEPTEMBER 23 1982"));
        map.put("China", df.parse("OCTOBER 1 1980"));
        //write your code here
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //write your code here
        Iterator<Map.Entry<String,Date>> entry = map.entrySet().iterator();
        while (entry.hasNext()) {
            Map.Entry<String, Date> pair = entry.next();
            int month = pair.getValue().getMonth();
            if (month >= 5 && month <= 7) {
                entry.remove();
            }
        }

    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
//        System.out.println(map);
    }
}
