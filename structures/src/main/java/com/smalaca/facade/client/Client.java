package com.smalaca.facade.client;

import com.smalaca.facade.system.Facade;

public class Client {
    private final Facade facade;

    public Client(Facade facade) {
        this.facade = facade;
    }

    public void doSomething() {
        instruction1();
        instruction2();
    }

    public void doSomethingMore() {
        instruction2();
        instruction3();
        instruction4();
    }

    private void instruction2() {
        //some code
        facade.doYetAnotherThing();
        //some code
    }

    private void instruction3() {
        facade.doSomethingElse();
        //some code
        facade.doStuff();
    }

    public void doSomethingAmazing() {
        instruction1();
        instruction4();
    }

    private void instruction1() {
        //some code
        facade.doSomethingDifferent();
    }

    private void instruction4() {
        facade.doSomething();
        // some code
        facade.doOtherThing();
    }
}
