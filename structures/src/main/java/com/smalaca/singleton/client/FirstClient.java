package com.smalaca.singleton.client;

import com.smalaca.singleton.Singleton;

public class FirstClient {

    public void doSomethingElse() {
        // some code
        Singleton.instance().doStuff();
    }
}
