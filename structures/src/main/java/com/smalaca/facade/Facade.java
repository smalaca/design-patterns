package com.smalaca.facade;

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
