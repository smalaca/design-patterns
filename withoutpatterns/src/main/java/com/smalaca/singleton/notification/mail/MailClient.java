package com.smalaca.singleton.notification.mail;

import com.smalaca.singleton.domain.User;
import com.smalaca.singleton.notification.domain.Content;
import com.smalaca.singleton.notification.domain.Receiver;
import com.smalaca.singleton.notification.domain.Title;

public interface MailClient {
    void sent(Title title, Content content, Receiver receiver, User user);
}
