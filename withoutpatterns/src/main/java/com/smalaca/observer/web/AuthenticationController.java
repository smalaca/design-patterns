package com.smalaca.observer.web;

import com.smalaca.observer.auth.AuthResult;
import com.smalaca.observer.auth.AuthenticationService;
import com.smalaca.observer.security.AccountSecurityService;
import com.smalaca.observer.security.AlertNotificationService;
import com.smalaca.observer.security.Password;

import javax.swing.plaf.basic.BasicListUI;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class AuthenticationController {
    private final AuthenticationService authenticationService;
    private final List<AuthenticationFailureObserver> observers;

    public AuthenticationController(
            AuthenticationService authenticationService, AccountSecurityService accountSecurityService,
            AlertNotificationService alertNotificationService) {
        this(authenticationService, asList(accountSecurityService, alertNotificationService));
    }

    public AuthenticationController(AuthenticationService authenticationService, List<AuthenticationFailureObserver> observers) {
        this.authenticationService = authenticationService;
        this.observers = observers;
    }

    public void login(String name, Password password) {
        AuthResult result = authenticationService.login(name, password);

        if (result.failed()) {
            if (result.wasThirdAttempt()) {
                observers.forEach(observer -> observer.notifyAboutThirdFailure(result));
            }
        } else {
            // some functionality
        }
    }
}
