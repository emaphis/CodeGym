package com.codegym.task.task10.task1015;

import java.util.ArrayList;

/*
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //write your code here
        ArrayList<String>[] array = new ArrayList[3];
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("one-A");
        list1.add("one-B");
        list1.add("one-C");
        array[0] =list1;

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("two-A");
        list2.add("two-B");
        list2.add("two-C");
        list2.add("two-D");
        array[1] = list2;

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("three-A");
        list3.add("three-B");
        list3.add("three-C");
        list3.add("three-D");
        list3.add("three-E");
        array[2] = list3;

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}