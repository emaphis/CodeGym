package com.codegym.task.task05.task0511;

/* 
Create a Dog class

*/

public class Dog {
    //write your code here
    String name;
    int height;
    String color;

    // - Name
    // initialize method that takes a name as an argument and
    // initializes the corresponding instance variable.
    public void initialize(String name) {
        this.name = name;
    }

    // - Name, height
    // initialize method that takes a name and height as arguments,
    // and initializes the corresponding instance variables.
    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    // - Name, height, color
    // initialize method that takes a name, height, and color as arguments,
    // and initializes the corresponding instance variables.
    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
