package com.codegym.task.task06.task0602;

/* 
Zombie cats, zombie dogs

*/

public class Cat {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog = null;
        cat = null;
    }

    //write your code here
    protected void finalize() {
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    //write your code here
    protected void finalize() {
        System.out.println("A Dog was destroyed");
    }
}