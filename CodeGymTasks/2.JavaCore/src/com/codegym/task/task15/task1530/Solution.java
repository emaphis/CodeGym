package com.codegym.task.task15.task1530;

/* 
Template pattern

*/

public class Solution {
    public static void main(String[] args) {
        DrinkMaker teamaker = new TeaMaker();
        teamaker.makeDrink();
        System.out.println();
        DrinkMaker lattemaker = new LatteMaker();
        lattemaker.makeDrink();
    }
}
