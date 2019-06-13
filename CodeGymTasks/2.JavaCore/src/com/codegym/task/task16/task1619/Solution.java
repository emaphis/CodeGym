package com.codegym.task.task16.task1619;

/* 
No interrupt, no dice?

*/

public class Solution {
    static  boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        stop = true;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!stop) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
