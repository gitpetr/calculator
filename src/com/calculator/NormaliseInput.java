package com.calculator;

public class NormaliseInput {

    public static String[] stringToArray(String str) {
        return str.trim().replaceAll("\\s+", " ").split(" ");
    };
}
