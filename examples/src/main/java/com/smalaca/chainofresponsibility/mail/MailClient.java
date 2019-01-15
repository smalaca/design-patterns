package com.smalaca.chainofresponsibility.mail;

import com.smalaca.chainofresponsibility.domain.User;

public interface MailClient {
    void sendTo(User to, String title, String message);
}
