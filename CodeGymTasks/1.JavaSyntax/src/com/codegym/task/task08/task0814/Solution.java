package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // write your code here
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(10);
        set.add(22);
        set.add(14);
        set.add(16);
        set.add(18);
        set.add(20);
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);
        set.add(11);
        set.add(13);
        set.add(15);
        set.add(17);

        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // write your code here
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            if (num > 10) {
                itr.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = createSet();
        HashSet<Integer> set2 = removeAllNumbersGreaterThan10(set);
        //System.out.println(set2);
    }
}
