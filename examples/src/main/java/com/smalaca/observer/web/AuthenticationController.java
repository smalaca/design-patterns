package com.smalaca.observer.web;

import com.smalaca.observer.auth.AuthResult;
import com.smalaca.observer.auth.AuthenticationObservable;
import com.smalaca.observer.auth.AuthenticationObserver;
import com.smalaca.observer.auth.AuthenticationService;
import com.smalaca.observer.security.Password;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationController implements AuthenticationObservable {
    private final AuthenticationService authenticationService;
    private final List<AuthenticationObserver> observers = new ArrayList<>();

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public void login(String name, Password password) {
        AuthResult result = authenticationService.login(name, password);

        if (result.faild()) {
            if (result.wasThirdAttempt()) {
                observers.forEach(observer -> observer.notifyOf(result));
            }
        } else {
            // some functionality
        }
    }

    @Override
    public void register(AuthenticationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(AuthenticationObserver observer) {
        observers.remove(observer);
    }
}
