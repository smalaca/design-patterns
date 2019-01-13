package com.smalaca.singleton.notification;

import com.smalaca.singleton.application.config.ApplicationConfiguration;
import com.smalaca.singleton.application.request.Input;
import com.smalaca.singleton.auth.domain.User;
import com.smalaca.singleton.notification.domain.Content;
import com.smalaca.singleton.notification.domain.Receiver;
import com.smalaca.singleton.notification.domain.Title;
import com.smalaca.singleton.notification.mail.MailClient;

public class NotificationsManager {
    private final MailClient mailClient;

    public NotificationsManager(MailClient mailClient) {
        this.mailClient = mailClient;
    }

    public void process(Input input) {
        Title title = extractTitle(input);
        Content content = extractContent(input);
        Receiver receiver = extractReceiver(input);
        User user = ApplicationConfiguration.anInstance().aLoggedUser();
        
        mailClient.sent(title, content, receiver, user);
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
