package com.smalaca.singleton.client;

import com.smalaca.singleton.Singleton;

public class SecondClient {
    public void doSomething() {
        // some code
        Singleton.instance().doStuff();
    }
}
