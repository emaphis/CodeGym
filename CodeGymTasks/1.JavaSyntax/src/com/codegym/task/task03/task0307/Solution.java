package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Zerg zerg1 = new Zerg();
        zerg1.name = "Zerg 1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Zerg 2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Zerg 3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Zerg 4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Zerg 5";
        Protoss prot1 = new Protoss();
        prot1.name = "Protoss 1";
        Protoss prot2 = new Protoss();
        prot2.name = "Protoss 2";
        Protoss prot3 = new Protoss();
        prot3.name = "Protoss 3";
        Terran terr1 = new Terran();
        terr1.name = "Terran 1";
        Terran terr2 = new Terran();
        terr2.name = "Terran 2";
        Terran terr3 = new Terran();
        terr3.name = "Terran 3";
        Terran terr4 = new Terran();
        terr4.name = "Terran 4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
