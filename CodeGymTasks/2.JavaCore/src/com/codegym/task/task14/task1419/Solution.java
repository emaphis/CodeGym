package com.codegym.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Exception invasion

*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //write your code here
        try {
            int[] array = new int[3];
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            FileInputStream file = new FileInputStream("unknown.txt");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            Object obj = null;
            String str = obj.toString();
            System.out.println(str);
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;
            System.out.println(num);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            String str = "";
            char ch = str.charAt(3);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
           int num = Integer.parseInt("NAN");
            System.out.println(num);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            SimpleDateFormat format = new SimpleDateFormat("MM, dd, yyyy");
            Date date = format.parse("Not a Date");
        } catch (ParseException e) {
            exceptions.add(e);
        }

        try {
            Thread.currentThread().sleep(-1000);
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        } catch (InterruptedException e) {
            exceptions.add(e);
        }

        try {
            List<Integer> list = new ArrayList<>();
            Iterator<Integer> iter = list.iterator();
            iter.remove();
        } catch (IllegalStateException e) {
            exceptions.add(e);
        }
    }
}
