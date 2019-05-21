package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here

        // two grandfathers
        Human grandfather1 = new Human("Fred", true, 65);
        Human grandfather2 = new Human("Charley", true, 62);

        // two grandmothers
        Human grandmother1 = new Human("Blanche", false, 59);
        Human grandmother2 = new Human("Ginger", false, 61);

        // one father
        Human father = new Human( "Sam", true, 45, grandfather1, grandmother1);

        // one mother
        Human mother = new Human("Julie", false, 44, grandfather2, grandmother2);

        // and three children.
        Human child1 = new Human("Bobby", true, 10, father, mother);
        Human child2 = new Human("Sue", false, 6, father, mother);
        Human child3 = new Human("Sally", false, 4, father, mother);


        // grandparents
        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);

        // parents
        System.out.println(father);
        System.out.println(mother);

        // and three children.
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        // write your code here
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}