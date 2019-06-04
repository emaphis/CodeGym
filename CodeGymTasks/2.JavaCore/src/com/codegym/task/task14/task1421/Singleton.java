package com.codegym.task.task14.task1421;

public class Singleton {
    private static boolean created = false;
    private static Singleton instance;

    private Singleton() {
        this.created = true;
    }

    public static Singleton getInstance() {
        if (!created) {
            instance = new Singleton();
        }

        return instance;
    }
}
