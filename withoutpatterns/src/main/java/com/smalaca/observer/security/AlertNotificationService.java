package com.smalaca.observer.security;

import com.smalaca.observer.auth.AuthResult;
import com.smalaca.observer.mail.MailClient;
import com.smalaca.observer.web.AuthenticationFailureObserver;

public class AlertNotificationService implements AuthenticationFailureObserver {
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

    @Override
    public void notifyAboutThirdFailure(AuthResult result) {
        notifyAdminsAboutAttempt(result);
    }
}
