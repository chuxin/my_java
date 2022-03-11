package com.example.demo.polymorphic;

import com.example.demo.polymorphic.Income;

public class Allowance extends Income{

    public Allowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}
