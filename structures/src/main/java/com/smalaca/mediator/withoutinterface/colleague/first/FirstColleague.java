package com.smalaca.mediator.withoutinterface.colleague.first;

import com.smalaca.mediator.withoutinterface.colleague.Input;
import com.smalaca.mediator.withoutinterface.mediator.Mediator;

public class FirstColleague {
    private final Mediator mediator;

    public FirstColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doStuff(Input input) {
        //method invoked by mediator
    }

    public void doSomethingElse(Input input) {
        //some code
        mediator.doSomethingElse(input);
    }
}
