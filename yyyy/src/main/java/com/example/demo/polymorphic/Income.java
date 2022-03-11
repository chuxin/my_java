package com.example.demo.polymorphic;

public class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return this.income * 0.1;
    }

    public int testSuper() {
        return 33;
    }

    public final int testFinal() {
        return 0;
    }

}
