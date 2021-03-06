package com.codegym.task.task13.task1304;

/* 
Selectable and Updatable

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Selectable select = new Screen();
        select.onSelect();
        Updatable updeate = (Updatable) select;
        updeate.refresh();
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //write your code here
    static class Screen implements Selectable, Updatable {

        @Override
        public void onSelect() {
        }

        @Override
        public void refresh() {
        }
    }
}
