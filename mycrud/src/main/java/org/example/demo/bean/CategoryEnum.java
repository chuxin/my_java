package org.example.demo.bean;

public enum CategoryEnum {
    Jan(0, "january"),
    Feb(1, "feburary"),
    Mar(2, "march"),
    Apr(3, "april");

    private String name;
    public final int val;
    private CategoryEnum(int val, String name) {
        this.val = val;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CategoryEnum{" +
                "name='" + name + '\'' +
                ", val=" + val +
                '}';
    }
}
