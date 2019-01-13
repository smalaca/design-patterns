package com.smalaca.singleton.notification;

import com.smalaca.singleton.application.request.Input;
import com.smalaca.singleton.domain.User;
import com.smalaca.singleton.notification.domain.Content;
import com.smalaca.singleton.notification.domain.Receiver;
import com.smalaca.singleton.notification.domain.Title;
import com.smalaca.singleton.notification.mail.MailClient;

public class NotificationsManager {
    private final MailClient mailClient;

    public NotificationsManager(MailClient mailClient) {
        this.mailClient = mailClient;
    }

    public void process(Input input, User logged) {
        Title title = extractTitle(input);
        Content content = extractContent(input);
        Receiver receiver = extractReceiver(input);

        mailClient.sent(title, content, receiver, logged);
    }

    private Title extractTitle(Input input) {
        return null;
    }

    private Content extractContent(Input input) {
        return null;
    }

    private Receiver extractReceiver(Input input) {
        return null;
    }
}
