package com.smalaca.observer.auth;

public class AuthenticationObserversManager {
    public void register(AuthenticationObservable observable, AuthenticationObserver observer) {
        observable.register(observer);
    }

    public void unregister(AuthenticationObservable observable, AuthenticationObserver observer) {
        observable.unregister(observer);
    }
}
