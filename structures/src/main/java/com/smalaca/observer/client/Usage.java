package com.smalaca.observer.client;

import com.smalaca.observer.publisher.Input;
import com.smalaca.observer.publisher.Publisher;

public class Usage {
    private final Publisher publisher;

    public Usage(Publisher publisher) {
        this.publisher = publisher;
    }

    public void doSomething(Input input) {
        // do something
        publisher.doSomething(input);
    }
}
