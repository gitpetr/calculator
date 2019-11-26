package com.calculator;
import java.util.Arrays;

public class Is_valid {
    public static Boolean inputString(String str) {
        str = str.trim();
        String[] splitStr = str.split(" ");
        return is_validArray(splitStr);
    }

    public static Boolean action(String act) {
        return Arrays.asList(Constants.ACTIONS).contains(act);
    }

    public static Boolean arabic(String[] isCalc) {
        if (is_validArray(isCalc)){
            return Arrays.asList(Constants.ARABIC_NUMBERS).contains(isCalc[0]) &&
                   Arrays.asList(Constants.ARABIC_NUMBERS).contains(isCalc[2]);
        }
        return false;
    }

    public static Boolean roman(String[] isCalc) {
        if (is_validArray(isCalc)){
            return Arrays.asList(Constants.ROMAN_NUMBERS).contains(isCalc[0].toUpperCase()) &&
                   Arrays.asList(Constants.ROMAN_NUMBERS).contains(isCalc[2].toUpperCase());
        }
        return false;
    }

    private static Boolean is_validArray (String[] checkArr) {
        return checkArr.length == 3;
    }
}
