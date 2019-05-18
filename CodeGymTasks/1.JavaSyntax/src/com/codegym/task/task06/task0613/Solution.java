package com.codegym.task.task06.task0613;

/* 
Cat and statics

*/

public class Solution {
    public static void main(String[] args) {
        // Create 10 cats
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();

        // Display the value of the variable catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        // Create a static variable catCount
        public static int catCount = 0;

        // Declare a constructor
        public Cat() {
            catCount++;
        }
    }
}
