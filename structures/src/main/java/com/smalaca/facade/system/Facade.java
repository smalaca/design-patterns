package com.smalaca.facade.system;

import com.smalaca.facade.system.first.FirstSubsystem;
import com.smalaca.facade.system.fourth.FourthSubsystem;
import com.smalaca.facade.system.second.SecondSubsystem;
import com.smalaca.facade.system.third.ThirdSubsystem;

public class Facade {
    private final FirstSubsystem firstSubsystem;
    private final SecondSubsystem secondSubsystem;
    private final ThirdSubsystem thirdSubsystem;
    private final FourthSubsystem fourthSubsystem;

    Facade(
            FirstSubsystem firstSubsystem, SecondSubsystem secondSubsystem,
            ThirdSubsystem thirdSubsystem, FourthSubsystem fourthSubsystem) {
        this.firstSubsystem = firstSubsystem;
        this.secondSubsystem = secondSubsystem;
        this.thirdSubsystem = thirdSubsystem;
        this.fourthSubsystem = fourthSubsystem;
    }

    public void doSomething() {
        firstSubsystem.doSomething();
    }

    public void doSomethingElse() {
        secondSubsystem.doSomethingElse();
    }

    public void doSomethingDifferent() {
        thirdSubsystem.doSomethingDifferent();
    }

    public void doOtherThing() {
        fourthSubsystem.doOtherThing();
    }

    public void doYetAnotherThing() {
        firstSubsystem.doYetAnotherThing();
    }

    public void doStuff() {
        secondSubsystem.doStuff();
    }
}
