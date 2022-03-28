package com.example.demo.testCollections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Students {
    private Map<String, Integer> cache;

    public Students(List<MyStudent> list) {
        this.cache = new HashMap<>();
        for (MyStudent piece: list) {
            this.cache.put(piece.name, piece.score);
        }
    }

    public int getScore(String name) {
        Integer score = this.cache.get(name);
        return score == null ? -1 : score.intValue();
    }
}
