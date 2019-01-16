package com.smalaca.observer.auth;

public interface AuthResult {
    boolean failed();

    boolean wasThirdAttempt();

    String description();

    String userId();
}
