package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            Integer num = Integer.parseInt(reader.readLine());
            list.add(num);
        }

        // split the lists
        for (Integer i : list) {
            if (i % 3 == 0)
                list3.add(i);
            if (i % 2 == 0)
                list2.add(i);
            if (i % 2 != 0 && i % 3 != 0)
                listOther.add(i);
        }

        printList(list2);
        printList(list3);
        printList(listOther);
    }

    public static void printList(List<Integer> list) {
        //write your code here
        for (Integer i : list)
            System.out.println(i);
    }
}
