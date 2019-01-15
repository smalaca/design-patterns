package com.smalaca.interpreter.language;

public class Divide implements CalculatorExpression {
    private final CalculatorExpression expression;
    private final long number;

    public Divide(CalculatorExpression expression, long number) {
        this.expression = expression;
        this.number = number;
    }

    @Override
    public long interpret() {
        return expression.interpret() / number;
    }
}
