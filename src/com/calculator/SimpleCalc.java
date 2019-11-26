package com.calculator;

public class SimpleCalc {
    public int calc(int a, String action, int b) {
        int result;

        switch (action) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/": result = a / b; break;
            default: result = -1;
        }

        return result;
    }
}
