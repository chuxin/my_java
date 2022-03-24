package com.example.demo.testCollections;

public class User implements Comparable<User> {
    private String name;
    private String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return this.name + "/" + this.number;
    }

    public int compareTo(User other) {
        if (this.number.charAt(0) == other.number.charAt(0)) {
//            return this.number.compareTo(other.number);   // 这么写有 bug
            return Integer.parseInt(this.number.substring(1)) - Integer.parseInt(other.number.substring(1));
        }

        if (this.number.charAt(0) == 'V') {
            // V 开头优先级高
            return -1;
        } else {
            return 1;
        }
    }
}
