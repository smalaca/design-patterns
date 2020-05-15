package com.smalaca.observer.web;

import com.smalaca.observer.auth.AuthResult;
import com.smalaca.observer.auth.AuthenticationService;
import com.smalaca.observer.mail.MailClient;
import com.smalaca.observer.security.*;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

class AuthenticationControllerTest {
    private static final String ACCOUNT_ID = UUID.randomUUID().toString();

    private final AuthenticationService authenticationService = mock(AuthenticationService.class);
    private final AccountSecurityService accountSecurityService = spiedAccoutSecuritService();
    private final AlertNotificationService alertNotificationService = spiedAlertNotificationService();

    private final AuthenticationController controller = new AuthenticationController(authenticationService, accountSecurityService, alertNotificationService);

    private AccountSecurityService spiedAccoutSecuritService() {
        AccountRepository accountRepository = mock(AccountRepository.class);
        Account account = mock(Account.class);
        given(accountRepository.findOf(ACCOUNT_ID)).willReturn(account);
        AccountSecurityService accountSecurityService = new AccountSecurityService(accountRepository);
        return spy(accountSecurityService);
    }

    private AlertNotificationService spiedAlertNotificationService() {
        MailClient mailClient = mock(MailClient.class);
        UserGroupRepository userGroupRepository = mock(UserGroupRepository.class);
        UserGroup userGroup = mock(UserGroup.class);
        given(userGroupRepository.anAdminGroup()).willReturn(userGroup);
        AlertNotificationService alertNotificationService = new AlertNotificationService(mailClient, userGroupRepository);
        return spy(alertNotificationService);
    }

    @Test
    void shouldNotifyAboutThirdFailure() {
        String name = UUID.randomUUID().toString();
        Password password = mock(Password.class);
        AuthResult expectedResult = mock(AuthResult.class);
        given(authenticationService.login(name, password)).willReturn(expectedResult);
        given(expectedResult.userId()).willReturn(ACCOUNT_ID);
        given(expectedResult.description()).willReturn(UUID.randomUUID().toString());
        given(expectedResult.failed()).willReturn(true);
        given(expectedResult.wasThirdAttempt()).willReturn(true);

        controller.login(name, password);

        then(accountSecurityService).should().blockAnAccount(ACCOUNT_ID);
        then(alertNotificationService).should().notifyAdminsAboutAttempt(expectedResult);
    }
}