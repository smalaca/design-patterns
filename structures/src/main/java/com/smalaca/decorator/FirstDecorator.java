package com.smalaca.decorator;

public class FirstDecorator extends BaseDecorator {
    public FirstDecorator(Component component) {
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
