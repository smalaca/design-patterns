package com.smalaca.strategy.client;

import com.smalaca.strategy.functionality.Functionality;
import com.smalaca.strategy.strategies.first.FirstStrategy;
import com.smalaca.strategy.strategies.second.SecondStrategy;

public class Client {
    private final Functionality functionality;

    public Client(Functionality functionality) {
        this.functionality = functionality;
    }

    public void doInFirstWay() {
        functionality.change(new FirstStrategy());
        functionality.doSomething();
    }

    public void doInSecondWay(){
        functionality.change(new SecondStrategy());
        functionality.doSomething();
    }
}
