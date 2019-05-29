package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String lastName;
        private String firstName;
        private int age;
        private boolean sex;
        private double weight;
        private char code;

        public Human(String lastName, String firstName, int age,  boolean sex, double weight, char code) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.code = code;
        }

        public Human(String lastName, String firstName, int age, boolean sex, double weight) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.code = ' ';
        }

        public Human(String lastName, String firstName, int age, boolean sex) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
            this.weight = 0;
            this.code = ' ';
        }

        public Human(String lastName, String firstName,  int age) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
            this.sex = false;
            this.weight = 0;
            this.code = ' ';
        }

        public Human(String lastName, String firstName) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = 0;
            this.sex = false;
            this.weight = 0;
            this.code = ' ';
        }

        public Human(String lastName) {
            this.lastName = lastName;
            this.firstName = "";
            this.age = 0;
            this.sex = false;
            this.weight = 0;
            this.code = ' ';
        }

        public Human() {
            this.lastName = "";
            this.firstName = "";
            this.age = 0;
            this.sex = false;
            this.weight = 0;
            this.code = ' ';
        }

        public Human(String lastName, int age) {
            this.lastName = lastName;
            this.firstName = "";
            this.age = age;
            this.sex = false;
            this.weight = 0;
            this.code = ' ';
        }

        public Human(String lastName, boolean sex) {
            this.lastName = lastName;
            this.firstName = "";
            this.age = 0;
            this.sex = sex;
            this.weight = 0;
            this.code = ' ';
        }

        public Human(String lastName, char code) {
            this.lastName = lastName;
            this.firstName = "";
            this.age = 0;
            this.sex = false;
            this.weight = 0;
            this.code = code;
        }

    }
}
