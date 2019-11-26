package com.calculator;
import java.util.Arrays;

public class RomanCalc extends SimpleCalc {
    public String calculate(String a, String action, String b) {
        int arabicA = Arrays.asList(Constants.ROMAN_NUMBERS).indexOf(a.toUpperCase());
        int arabicB = Arrays.asList(Constants.ROMAN_NUMBERS).indexOf(b.toUpperCase());
        int result = calc(arabicA, action, arabicB);

        if (result < 0) {
            result = Math.abs(result);
            return "-" + Constants.ROMAN_FULL_NUMBERS[result];
        }

        return Constants.ROMAN_FULL_NUMBERS[result];
    }
}
