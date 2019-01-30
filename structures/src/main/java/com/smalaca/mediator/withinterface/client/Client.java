package com.smalaca.mediator.withinterface.client;

import com.smalaca.mediator.withinterface.colleague.first.FirstColleague;
import com.smalaca.mediator.withinterface.colleague.second.SecondColleague;
import com.smalaca.mediator.withinterface.mediator.Colleague;
import com.smalaca.mediator.withinterface.mediator.Mediator;
import com.smalaca.mediator.withinterface.mediator.real.RealMediator;

public class Client {
    private final Mediator mediator;

    private Client(Mediator mediator) {
        this.mediator = mediator;
    }

    public static Client withRealMediator() {
        return new Client(new RealMediator());
    }

    public void addColleague(FirstColleague firstColleague) {
        mediator.add(firstColleague);
    }

    public void addColleague(SecondColleague secondColleague) {
        mediator.add(secondColleague);
    }

    public void sendMessage(String message, Colleague colleague) {
        colleague.send(message);
    }
}
