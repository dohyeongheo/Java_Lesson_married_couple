package com.example.util;

public class Calculator {
    public int plus(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    public int minus(int a, int b) {
        int result;
        if (a > b) {
            result = a - b;
        } else {
            result = b -a;
        }
        return result;
    }
}
