package com.smalaca.facade.notification;

import com.smalaca.facade.chat.ChatService;
import com.smalaca.facade.domain.Link;
import com.smalaca.facade.domain.Mail;
import com.smalaca.facade.domain.MailAddress;
import com.smalaca.facade.domain.RandomCode;
import com.smalaca.facade.domain.Report;
import com.smalaca.facade.domain.Statistics;
import com.smalaca.facade.domain.User;
import com.smalaca.facade.mail.MailClient;
import com.smalaca.facade.sms.SmsGate;

public class NotificationsFacade {
    private static final MailAddress APPLICATION_MAIL_ADDRESS_ADDRESS = new MailAddress("application@app.com");

    private final MailClient mailClient;
    private final ChatService chatService;
    private final SmsGate smsGate;

    NotificationsFacade(MailClient mailClient, ChatService chatService, SmsGate smsGate) {
        this.mailClient = mailClient;
        this.chatService = chatService;
        this.smsGate = smsGate;
    }

    public void sendSms(User user, RandomCode randomCode) {
        smsGate.send(user.phoneNumber(), randomCode.value());
    }

    public void sendSms(User user, Link link) {
        smsGate.send(user.phoneNumber(), link.value());
    }

    public void sendMail(User user, String message) {
        Mail mail = aMail(user, message)
                .content(message)
                .build();

        mailClient.sendMail(mail);
    }

    public void sendMail(User user, Report report) {
        Mail mail = aMail(user, report.name())
                .addAttachement(report)
                .build();

        mailClient.sendMail(mail);
    }

    public void sendMail(User user, Statistics statistics) {
        Mail mail = aMail(user, statistics.link().value())
                .addAttachement(statistics)
                .build();

        mailClient.sendMail(mail);
    }

    private Mail.Builder aMail(User user, String title) {
        return Mail.Builder.aMail(APPLICATION_MAIL_ADDRESS_ADDRESS, user.mail())
                .title(title);
    }

    public void sendChatMessage(User user, String message) {
        chatService.send(user, message);
    }
}
