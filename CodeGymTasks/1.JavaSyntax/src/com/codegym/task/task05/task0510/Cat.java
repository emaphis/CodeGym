package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    //write your code here
    String name;
    int weight;
    int age;
    String address;
    String color;

    // - Name,
    // initialize method that takes a name as an argument, but initializes all variables except the address.
    public void initialize(String name) {
        this.name = name;
        this.weight = 5;
        this.age = 5;
        this.color = "yellow";
    }

    // - Name, weight, age
    // initialize method that takes a name, weight, and age as arguments, but initializes
    // all variables except the address.
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "yellow";
    }

    // - Name, age (standard weight)
    // initialize method that takes a name and age as arguments, and
    // initializes all variables except the address.
    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = "yellow";
    }

    // - Weight, color (unknown name, address and age, i.e. a homeless cat)
    //  initialize method that takes a weight and color as arguments, and initializes
    //  all variables except the name and address.
    public void initialize(int weight, String color) {
        this.weight = weight;
        this.age = 5;
        this.color = color;
    }

    // - Weight, color, address (someone else's pet)
    // initialize method that takes a weight, color, and address as arguments, but
    // initializes all variables except the name.
    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.age = 5;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
