package com.smalaca.decorator;

public class SecondDecorator extends BaseDecorator {
    protected SecondDecorator(Component component) {
        super(component);
    }

    @Override
    public Result doSomething() {
        Result result = component().doSomething();
        return extra(result);
    }

    private Result extra(Result result) {
        return null;
    }
}
