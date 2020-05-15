package com.smalaca.facade.auth;

import com.smalaca.facade.chat.ChatService;
import com.smalaca.facade.communication.CommunicationFacade;
import com.smalaca.facade.domain.Mail;
import com.smalaca.facade.domain.MailAddress;
import com.smalaca.facade.domain.RandomCode;
import com.smalaca.facade.domain.User;
import com.smalaca.facade.http.Request;
import com.smalaca.facade.mail.MailClient;
import com.smalaca.facade.sms.SmsGate;

public class AuthenticationService {
    private static final MailAddress APPLICATION_MAIL_ADDRESS = new MailAddress("application@app.com");

    private final CommunicationFacade communicationFacade;

    public AuthenticationService(MailClient mailClient, ChatService chatService, SmsGate smsGate) {
        communicationFacade = new CommunicationFacade(mailClient, chatService, smsGate);
    }

    public void login(Request request) {
        if (twoFactorAuthentication(request)) {
            communicationFacade.sendSms(aUser(), aRandomCode());
        }

        // some logic

        if (thirdFailedAttempt()) {
            communicationFacade.sendMail(aUser(), APPLICATION_MAIL_ADDRESS, "Third failed try to login. Is that really you?");
        }

        // some logic

        if (successfulLogin()) {
            communicationFacade.sendChat(aUser(), "Successful login.");
        }
    }

    @Deprecated
    boolean successfulLogin() {
        return false;
    }

    @Deprecated
    boolean thirdFailedAttempt() {
        return false;
    }

    @Deprecated
    RandomCode aRandomCode() {
        return null;
    }

    @Deprecated
    User aUser() {
        return null;
    }

    @Deprecated
    boolean twoFactorAuthentication(Request request) {
        return false;
    }
}
