package com.smalaca.observer.security;

import com.smalaca.observer.auth.AuthResult;
import com.smalaca.observer.mail.MailClient;

public class AlertNotificationService {
    private final MailClient mailClient;
    private final UserGroupRepository userGroupRepository;

    public AlertNotificationService(MailClient mailClient, UserGroupRepository userGroupRepository) {
        this.mailClient = mailClient;
        this.userGroupRepository = userGroupRepository;
    }

    public void notifyAdminsAboutAttempt(AuthResult result) {
        UserGroup userGroup = userGroupRepository.anAdminGroup();

        mailClient.send(userGroup.mailAddress(), result.description());
    }

    public void notifyAboutThirdFailure(AuthResult result) {
        notifyAdminsAboutAttempt(result);
    }
}
