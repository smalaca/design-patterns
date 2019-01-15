package com.smalaca.interpreter;

public class Calculator {
    public long add(long number1, long number2) {
        return number1 + number2;
    }

    public long substract(long number1, long number2) {
        return number1 - number2;
    }

    public long divide(long number1, long number2) {
        return number1 / number2;
    }

    public long multiple(long number1, long number2) {
        return number1 * number2;
    }

    public long percentage(long number1, int percentage) {
        return (number1 * percentage)/100;
    }
}
