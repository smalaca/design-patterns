package com.smalaca.observer.mail;

public interface MailClient {
    void send(MailAddress mailAddress, String description);
}
