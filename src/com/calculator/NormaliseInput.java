package com.calculator;

public class NormaliseInput {

    public static String[] normalize(String str) throws Exception {
        String[] result = str.trim().split(" ");

        for (int i = 0; i < result.length; i++) {
            result[i] = result[i].trim();
        }

        return result;
    };
}
