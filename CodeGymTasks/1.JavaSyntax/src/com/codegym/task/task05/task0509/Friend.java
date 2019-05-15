package com.codegym.task.task05.task0509;

/* 
Create a Friend class

*/

public class Friend {
    //write your code here
    String name;
    int age;
    char sex;

    //          initialize
    public void initialize(String newName) {
        this.name = newName;
    }

    public void initialize(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }

    public void initialize(String newName, int newAge, char newSex) {
        this.name = newName;
        this.age = newAge;
        this.sex = newSex;
    }


    public static void main(String[] args) {

    }
}
