package com.example.main;

import com.example.util.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.plus(5,10));
        System.out.println(calc.minus(5,10));

        com.example.util2.Calculator cal2 = new com.example.util2.Calculator();
    }


}
