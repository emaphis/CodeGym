package com.codegym.task.task14.task1408;

public class NorthAmericanHen extends Hen {

    @Override
    int getMonthlyEggCount() {
        return 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                " I come from " + Continent.NORTHAMERICA +
                ". I lay " +
                getMonthlyEggCount() +
                " eggs a month.";
    }
}
