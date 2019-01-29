package com.smalaca.decorator.client;

import com.smalaca.decorator.component.Component;
import com.smalaca.decorator.component.FirstDecorator;
import com.smalaca.decorator.component.Result;
import com.smalaca.decorator.component.SecondDecorator;
import com.smalaca.decorator.component.TheComponent;

public class Client {
    public Component aComponent() {
        return new TheComponent();
    }

    public Component aFirstDecorator(Component component) {
        return new FirstDecorator(component);
    }

    public Component aSecondDecorator(Component component) {
        return new SecondDecorator(component);
    }

    public Result doSomething(Component component) {
        return component.doSomething();
    }
}
