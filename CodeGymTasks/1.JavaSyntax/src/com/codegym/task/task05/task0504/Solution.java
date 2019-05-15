package com.codegym.task.task05.task0504;


/* 
The Three "Muscateers"

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat muscateer1 = new Cat("Porthos", 3, 10, 5);
        Cat muscateer2 = new Cat("Athos", 4, 9, 6);
        Cat muscateer3 = new Cat("Dartagnan", 11, 6, 8);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}