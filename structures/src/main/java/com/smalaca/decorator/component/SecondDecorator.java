package com.smalaca.decorator.component;

public class SecondDecorator extends BaseDecorator {
    public SecondDecorator(Component component) {
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
