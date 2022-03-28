package com.example.demo.polymorphic;

public class Salary extends Income {
    public final String values = "xxxx";

    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (this.income <= 5000) {
            return 0;
        }

        return (this.income - 5000) * 0.2;
    }

    public int getTestSuper() {
        return super.testSuper() + 10;
    }

    public int testFinal(String ss) {
        return 1;
    }
}
