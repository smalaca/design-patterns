package com.smalaca.facade.communication;

import com.smalaca.facade.chat.ChatService;
import com.smalaca.facade.domain.*;
import com.smalaca.facade.mail.MailClient;
import com.smalaca.facade.sms.SmsGate;

public class CommunicationFacade {
    private final MailClient mailClient;
    private final ChatService chatService;
    private final SmsGate smsGate;

    public CommunicationFacade(MailClient mailClient, ChatService chatService, SmsGate smsGate) {
        this.mailClient = mailClient;
        this.chatService = chatService;
        this.smsGate = smsGate;
    }

    public void sendSms(User user, RandomCode randomCode) {
        smsGate.send(user.phoneNumber(), randomCode.value());
    }

    public void sendMail(User user, MailAddress applicationMailAddress, String message) {
        Mail mail = Mail.Builder.aMail(applicationMailAddress, user.mail())
                .title(message)
                .content(message)
                .build();

        mailClient.sendMail(mail);
    }

    public void sendChat(User user, String message) {
        chatService.send(user, message);
    }
}
