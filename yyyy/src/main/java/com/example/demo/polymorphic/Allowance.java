package com.example.demo.polymorphic;

public class Allowance extends Income{

    public Allowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}
