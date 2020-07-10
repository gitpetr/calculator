package com.calculator;
import java.util.Arrays;

public class IsValid {
    public static Boolean inputString(String str) {
        String[] string = NormaliseInput.stringToArray(str);
        return isValidArray(string);
    }

    public static Boolean action(String act) {
        return Arrays.asList(Constants.ACTIONS).contains(act);
    }

    public static Boolean arabic(String[] isCalc) {
        if (isValidArray(isCalc)){
            return Arrays.asList(Constants.ARABIC_NUMBERS).contains(isCalc[0]) &&
                   Arrays.asList(Constants.ARABIC_NUMBERS).contains(isCalc[2]);
        }
        return false;
    }

    public static Boolean roman(String[] isCalc) {
        if (isValidArray(isCalc)){
            return Arrays.asList(Constants.ROMAN_NUMBERS).contains(isCalc[0].toUpperCase()) &&
                   Arrays.asList(Constants.ROMAN_NUMBERS).contains(isCalc[2].toUpperCase());
        }
        return false;
    }

    private static Boolean isValidArray(String[] checkArr) {
        return checkArr.length == 3;
    }
}
