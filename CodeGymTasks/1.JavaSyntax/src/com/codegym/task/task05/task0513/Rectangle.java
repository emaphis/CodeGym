package com.codegym.task.task05.task0513;

/* 
Let's put together a rectangle

*/

public class Rectangle {
    //write your code here
    int top;
    int left;
    int width;
    int height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    // - width/height is not specified (both are 0)
    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
    }

    // - height is not specified (it is equal to the width), we'll create a square
    public void initialize(int width) {
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle other) {
        this.left = other.left;
        this.top  = other.top;
        this.height = other.height;
        this.width = other.width;
    }


    public static void main(String[] args) {

    }
}
