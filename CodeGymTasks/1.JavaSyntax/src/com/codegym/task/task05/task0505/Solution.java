package com.codegym.task.task05.task0505;

/* 
Feline carnage

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat muscateer1 = new Cat("Porthos", 3, 10, 5);
        Cat muscateer2 = new Cat("Athos", 4, 9, 6);
        Cat muscateer3 = new Cat("Dartagnan", 11, 6, 8);

        System.out.println(muscateer1.fight(muscateer2));
        System.out.println(muscateer1.fight(muscateer3));
        System.out.println(muscateer2.fight(muscateer3));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
