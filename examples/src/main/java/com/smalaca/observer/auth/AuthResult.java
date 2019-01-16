package com.smalaca.observer.auth;

public interface AuthResult {
    boolean faild();

    boolean wasThirdAttempt();

    String description();

    String userId();
}
