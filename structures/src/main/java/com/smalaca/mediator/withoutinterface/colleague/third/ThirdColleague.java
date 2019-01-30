package com.smalaca.mediator.withoutinterface.colleague.third;

import com.smalaca.mediator.withoutinterface.colleague.Input;
import com.smalaca.mediator.withoutinterface.mediator.Mediator;

public class ThirdColleague {
    private final Mediator mediator;

    public ThirdColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doStuff(Input input) {
        //method invoked by mediator
    }

    public void doSomething(Input input) {
        //some code
        mediator.doSomething(input);
    }
}
