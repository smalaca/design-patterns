package com.smalaca.facade.auth;

import com.smalaca.facade.chat.ChatService;
import com.smalaca.facade.domain.Mail;
import com.smalaca.facade.domain.MailAddress;
import com.smalaca.facade.domain.RandomCode;
import com.smalaca.facade.domain.User;
import com.smalaca.facade.http.Request;
import com.smalaca.facade.mail.MailClient;
import com.smalaca.facade.sms.SmsGate;

public class AuthenticationService {
    private static final MailAddress APPLICATION_MAIL_ADDRESS_ADDRESS = new MailAddress("application@app.com");

    private final MailClient mailClient;
    private final ChatService chatService;
    private final SmsGate smsGate;

    public AuthenticationService(MailClient mailClient, ChatService chatService, SmsGate smsGate) {
        this.mailClient = mailClient;
        this.chatService = chatService;
        this.smsGate = smsGate;
    }

    public void login(Request request) {
        if (twoFactorAuthentication(request)) {
            smsGate.send(aUser().phoneNumber(), aRandomCode().value());
        }

        // some logic

        if (thirdFailedAttempt()) {
            String message = "Third failed try to login. Is that really you?";
            Mail mail = Mail.Builder.aMail(APPLICATION_MAIL_ADDRESS_ADDRESS, aUser().mail())
                    .title(message)
                    .content(message)
                    .build();

            mailClient.sendMail(mail);
        }

        // some logic

        if (successfulLogin()) {
            chatService.send(aUser(), "Successful login.");
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
