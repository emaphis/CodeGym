package com.codegym.task.task06.task0604;

/* 
Cat counter

*/

public class Cat {
    public static int catCount = 0;

    //write your code here
    public Cat() {
        catCount++;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        catCount--;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2000000; i++) {
            Cat cat = new Cat();
        }
        System.out.println(catCount);
    }
}