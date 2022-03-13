package com.example.demo.coreClass;

public enum Weekday {
    SUN(0, "星期天"), MON(1, "星期一"), TUE(2, "星期二"),
    WES(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"),
    SAT(6, "星期六");

    public final int dayValue;
    private final String name;

    private Weekday(int dayValue, String name) {
        this.dayValue = dayValue;
        this.name = name;
    }

    @Override
    public String toString() {
        return "呃呃呃-" + this.name;
    }
}
