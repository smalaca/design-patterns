package com.smalaca.interpreter;

import com.smalaca.interpreter.language.CalculatorExpression;
import com.smalaca.interpreter.language.Divide;
import com.smalaca.interpreter.language.Multiple;
import com.smalaca.interpreter.language.Percentage;
import com.smalaca.interpreter.language.RawNumber;
import com.smalaca.interpreter.language.Substract;
import com.smalaca.interpreter.language.Sum;

public class Calculator {
    public CalculatorExpression number(long number) {
        return new RawNumber(number);
    }
    
    public CalculatorExpression add(CalculatorExpression expression, long number) {
        return new Sum(expression, number);
    }

    public CalculatorExpression substract(CalculatorExpression expression, long number) {
        return new Substract(expression, number);
    }

    public CalculatorExpression divide(CalculatorExpression expression, long number) {
        return new Divide(expression, number);
    }

    public CalculatorExpression multiple(CalculatorExpression expression, long number) {
        return new Multiple(expression, number);
    }

    public CalculatorExpression percentage(CalculatorExpression expression, int percentage) {
        return new Percentage(expression, percentage);
    }
    
    public long calculate(CalculatorExpression expression) {
        return expression.interpret();
    }
}
