package com.smalaca.interpreter.language;

public class Sum implements CalculatorExpression {
    private final CalculatorExpression expression;
    private final long number;

    public Sum(CalculatorExpression expression, long number) {
        this.expression = expression;
        this.number = number;
    }

    @Override
    public long interpret() {
        return expression.interpret() + number;
    }
}
