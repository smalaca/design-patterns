package com.smalaca.interpreter.language;

public class Percentage implements CalculatorExpression {
    private final CalculatorExpression expression;
    private final int percentage;

    public Percentage(CalculatorExpression expression, int percentage) {
        this.expression = expression;
        this.percentage = percentage;
    }

    @Override
    public long interpret() {
        return (expression.interpret() * percentage) / 100;
    }
}
