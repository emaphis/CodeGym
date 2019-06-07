package com.codegym.task.task15.task1517;

/* 
Static modifiers and exceptions

*/

// See:
// https://stackoverflow.com/questions/13532794/why-is-it-not-allowed-to-throw-an-exception-in-a-java-instance-initialization-bl

public class Solution {
    public static int A = 0;

    static {
        // Throw an exception here
        if (true)
            throw new RuntimeException();
       // else
       //     A = B / A;
    }

    public static int B = 5;

    public static void main(String[] args)
    {
        System.out.println(B);
    }
}
