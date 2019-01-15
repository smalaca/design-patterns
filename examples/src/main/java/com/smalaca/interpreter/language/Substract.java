package com.smalaca.interpreter.language;

public class Substract implements CalculatorExpression {
    private final CalculatorExpression expression;
    private final long number;

    public Substract(CalculatorExpression expression, long number) {
        this.expression = expression;
        this.number = number;
    }

    @Override
    public long interpret() {
        return expression.interpret() - number;
    }
}
