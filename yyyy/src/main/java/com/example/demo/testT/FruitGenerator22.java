package com.example.demo.testT;

import java.util.Random;

public class FruitGenerator22 implements Generator<String> {
    private String[] fruits = new String[]{"Apple", "banana", "pear"};

    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }
}
