package com.example.demo.unittest;

public class StringUtils {
    public static String capitalize(String a) {
        if (a.length() == 0) {
            return a;
        }

        return Character.toUpperCase(a.charAt(0)) + a.substring(1).toLowerCase();
    }
}
