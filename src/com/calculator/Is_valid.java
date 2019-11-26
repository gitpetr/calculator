package com.calculator;
import java.util.Arrays;

public class Is_valid {
    public static Boolean inputString(String str) throws Exception {
        str = str.trim();
        String[] splitStr = str.split(" ");
        return splitStr.length == 3;
    }

    public static Boolean action(String act) {
        return Arrays.asList(Constants.ACTIONS).contains(act);
    }

    public static Boolean arabic(String[] isCalc) throws Exception {
        return Arrays.asList(Constants.ARABIC_NUMBERS).contains(isCalc[0]) &&
                Arrays.asList(Constants.ARABIC_NUMBERS).contains(isCalc[2]);
    }

    public static Boolean roman(String[] isCalc) throws Exception {
        return Arrays.asList(Constants.ROMAN_NUMBERS).contains(isCalc[0].toUpperCase()) &&
                Arrays.asList(Constants.ROMAN_NUMBERS).contains(isCalc[2].toUpperCase());
    }
}