package com.smalaca.facade.auth;

import com.smalaca.facade.domain.RandomCode;
import com.smalaca.facade.domain.User;
import com.smalaca.facade.http.Request;
import com.smalaca.facade.notification.NotificationsFacade;

public class AuthenticationService {
    private final NotificationsFacade notificationsFacade;

    public AuthenticationService(NotificationsFacade notificationsFacade) {
        this.notificationsFacade = notificationsFacade;
    }

    public void login(Request request) {
        if (twoFactorAuthentication(request)) {
            notificationsFacade.sendSms(aUser(), aRandomCode());
        }

        // some logic

        if (thirdFailedAttempt()) {
            notificationsFacade.sendMail(aUser(), "Third failed try to login. Is that really you?");
        }

        // some logic

        if (successfulLogin()) {
            notificationsFacade.sendChatMessage(aUser(), "Successful login.");
        }
    }

    private boolean successfulLogin() {
        return false;
    }

    private boolean thirdFailedAttempt() {
        return false;
    }

    private RandomCode aRandomCode() {
        return null;
    }

    private User aUser() {
        return null;
    }

    private boolean twoFactorAuthentication(Request request) {
        return false;
    }
}
