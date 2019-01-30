package com.smalaca.observer.client;

import com.smalaca.observer.publisher.Publisher;
import com.smalaca.observer.publisher.Subscriber;
import com.smalaca.observer.subscriber.first.FirstSubscriber;
import com.smalaca.observer.subscriber.second.SecondSubscriber;

public class ManageSubscribers {
    private final Publisher publisher;

    public ManageSubscribers(Publisher publisher) {
        this.publisher = publisher;
    }

    public void subscription(FirstSubscriber firstSubscriber) {
        subscribe(firstSubscriber);
    }

    public void subscription(SecondSubscriber secondSubscriber) {
        subscribe(secondSubscriber);
    }

    private void subscribe(Subscriber subscriber) {
        publisher.subscribe(subscriber);
    }

    public void resign(FirstSubscriber firstSubscriber) {
        unsubscribe(firstSubscriber);
    }

    public void resign(SecondSubscriber secondSubscriber) {
        unsubscribe(secondSubscriber);
    }

    private void unsubscribe(Subscriber subscriber) {
        publisher.unsubscribe(subscriber);
    }
}
