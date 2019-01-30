package com.smalaca.observer.publisher;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void doSomething(Input input) {
        instruction1(input);
        notifySubscribers(input);
    }

    private void instruction1(Input input) {

    }

    private void notifySubscribers(Input input) {
        subscribers.forEach(subscriber -> subscriber.update(input));
    }
}
