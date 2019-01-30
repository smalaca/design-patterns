package com.smalaca.singleton;

public class Singleton {
    private static final Singleton SINGLETON = new Singleton();

    private Singleton() {

    }

    public static Singleton instance() {
        return SINGLETON;
    }

    public void doStuff() {
        // some code
    }
}
