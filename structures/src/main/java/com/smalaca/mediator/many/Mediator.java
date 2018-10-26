package com.smalaca.mediator.many;

public class Mediator {
    private final FirstReceiver firstReceiver;
    private final SecondReceiver secondReceiver;
    private final ThirdReceiver thirdReceiver;

    public Mediator(FirstReceiver firstReceiver, SecondReceiver secondReceiver, ThirdReceiver thirdReceiver) {
        this.firstReceiver = firstReceiver;
        this.secondReceiver = secondReceiver;
        this.thirdReceiver = thirdReceiver;
    }

    public void doSomething(Input input) {
        firstReceiver.doStuff(input);
        secondReceiver.doStuff(input);
    }

    public void doSomethingElse(Input input) {
        secondReceiver.doStuff(input);
        thirdReceiver.doStuff(input);
    }

    public void doSomethingDifferent(Input input) {
        thirdReceiver.doStuff(input);
    }
}
