package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        ArrayList<Human> children0 = new ArrayList<>();

        // three children.
        Human child1 = new Human("Bobby", true, 10, new ArrayList<>());
        Human child2 = new Human("Sue", false, 6, new ArrayList<>());
        Human child3 = new Human("Sally", false, 4, new ArrayList<>());

        children0.add(child1);
        children0.add(child2);
        children0.add(child3);

        // parents
        Human father = new Human( "Sam", true, 45, children0);
        ArrayList<Human> children1 = new ArrayList<>();
        children1.add(father);
        Human mother = new Human("Julie", false, 44, children0);
        ArrayList<Human> children2 = new ArrayList<>();
        children2.add(mother);

        // two grandparents
        Human grandfather1 = new Human("Fred", true, 65, children1);
        Human grandmother1 = new Human("Blanche", false, 59, children1);

        Human grandfather2 = new Human("Charley", true, 62, children2);
        Human grandmother2 = new Human("Ginger", false, 61, children2);

        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //write your code here
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(children);
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
