package com.smalaca.observer.auth;

public interface AuthenticationObserver {
    void notifyOf(AuthResult result);
}
