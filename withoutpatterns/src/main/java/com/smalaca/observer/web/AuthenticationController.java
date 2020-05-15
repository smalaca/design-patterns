package com.smalaca.observer.web;

import com.smalaca.observer.auth.AuthResult;
import com.smalaca.observer.auth.AuthenticationService;
import com.smalaca.observer.security.AccountSecurityService;
import com.smalaca.observer.security.AlertNotificationService;
import com.smalaca.observer.security.Password;

public class AuthenticationController {
    private final AuthenticationService authenticationService;
    private final AccountSecurityService accountSecurityService;
    private final AlertNotificationService alertNotificationService;

    public AuthenticationController(
            AuthenticationService authenticationService, AccountSecurityService accountSecurityService,
            AlertNotificationService alertNotificationService) {
        this.authenticationService = authenticationService;
        this.accountSecurityService = accountSecurityService;
        this.alertNotificationService = alertNotificationService;
    }

    public void login(String name, Password password) {
        AuthResult result = authenticationService.login(name, password);

        if (result.failed()) {
            if (result.wasThirdAttempt()) {
                accountSecurityService.notifyAboutThirdFailure(result);
                alertNotificationService.notifyAboutThirdFailure(result);
            }
        } else {
            // some functionality
        }
    }
}
