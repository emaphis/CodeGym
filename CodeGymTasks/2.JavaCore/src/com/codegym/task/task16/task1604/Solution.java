package com.codegym.task.task16.task1604;

/* 
Displaying a stack trace

*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    public static class SpecialThread implements Runnable {

        @Override
        public void run() {
            //System.out.println("got here aaaaaa");
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
            //System.out.println("get here bbbbb");
        }
    }

}
