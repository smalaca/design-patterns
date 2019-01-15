package com.smalaca.interpreter.language;

public class RawNumber implements CalculatorExpression {
    private final long number;

    public RawNumber(long number) {
        this.number = number;
    }

    @Override
    public long interpret() {
        return number;
    }
}
