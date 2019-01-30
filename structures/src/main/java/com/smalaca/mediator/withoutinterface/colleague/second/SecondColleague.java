package com.smalaca.mediator.withoutinterface.colleague.second;

import com.smalaca.mediator.withoutinterface.colleague.Input;
import com.smalaca.mediator.withoutinterface.mediator.Mediator;

public class SecondColleague {
    private final Mediator mediator;

    public SecondColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doStuff(Input input) {
        //method invoked by mediator
    }

    public void doSomethingDifferent(Input input) {
        //some code
        mediator.doSomethingDifferent(input);
    }
}
