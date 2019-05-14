package com.codegym.task.task04.task0441;


/* 
Somehow average

*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (isMiddle(a, b, c))
            System.out.println(a);
        else if (isMiddle(b, a, c))
            System.out.println(b);
        else if (isMiddle(c, a, b))
            System.out.println(c);
        else
            System.out.println(a);
    }

    static boolean isMiddle(int a, int b, int c) {
        return ((a <= b && a >= c) || (a >= b && a <= c));
    }

}
