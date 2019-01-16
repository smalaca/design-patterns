package com.smalaca.observer.auth;

public interface AuthenticationObservable {
    void register(AuthenticationObserver observer);

    void unregister(AuthenticationObserver observer);
}
