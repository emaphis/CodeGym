package com.codegym.task.task08.task0808;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* 
10 thousand deletions and insertions

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //write your code here
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
    }

    public static void get10000(List list) {
        //write your code here
        for (int i = 0; i < 10000; i++) {
            Object obj = list.get(i);
        }
    }

    public static void set10000(List list) {
        //write your code here
        for (int i = 0; i < 10000; i++) {
            list.set(i, new Object());
        }
    }

    public static void remove10000(List list) {
        //write your code here
        for (int i = list.size() - 1; i >= 0 ; i--) {
            list.remove(i);
        }
    }
}
