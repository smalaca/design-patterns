package com.smalaca.facade.mail;

import com.smalaca.facade.domain.Mail;

public interface MailClient {
    void sendMail(Mail mail);
}
