package com.smalaca.mediator.withoutinterface.mediator;

import com.smalaca.mediator.withoutinterface.colleague.Input;
import com.smalaca.mediator.withoutinterface.colleague.first.FirstColleague;
import com.smalaca.mediator.withoutinterface.colleague.second.SecondColleague;
import com.smalaca.mediator.withoutinterface.colleague.third.ThirdColleague;

public class Mediator {
    private final FirstColleague firstColleague;
    private final SecondColleague secondColleague;
    private final ThirdColleague thirdColleague;

    public Mediator(FirstColleague firstColleague, SecondColleague secondColleague, ThirdColleague thirdColleague) {
        this.firstColleague = firstColleague;
        this.secondColleague = secondColleague;
        this.thirdColleague = thirdColleague;
    }

    public void doSomething(Input input) {
        firstColleague.doStuff(input);
        secondColleague.doStuff(input);
    }

    public void doSomethingElse(Input input) {
        secondColleague.doStuff(input);
        thirdColleague.doStuff(input);
    }

    public void doSomethingDifferent(Input input) {
        thirdColleague.doStuff(input);
    }
}
