package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write your code here
        int power = age + weight + strength;
        int aPower = anotherCat.age + anotherCat.weight + anotherCat.strength;
        return power > aPower;
    }


    public static void main(String[] args) {
        Cat fluffy = new Cat();
        fluffy.weight = 10;
        fluffy.age = 2;
        fluffy.strength = 5;

        Cat muffy = new Cat();
        muffy.weight = 12;
        muffy.age = 3;
        muffy.strength = 4;

        System.out.println(fluffy.fight(muffy));
        System.out.println(muffy.fight(fluffy));
    }
}
