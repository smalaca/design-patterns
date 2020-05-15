package com.smalaca.facade.auth;

import com.smalaca.facade.chat.ChatService;
import com.smalaca.facade.domain.*;
import com.smalaca.facade.http.Request;
import com.smalaca.facade.mail.MailClient;
import com.smalaca.facade.sms.SmsGate;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.UUID;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

class AuthenticationServiceTest {
    private static final Request REQUEST = mock(Request.class);
    private static final PhoneNumber PHONE_NUMBER = mock(PhoneNumber.class);
    private static final String RANDOM_CODE_VALUE = UUID.randomUUID().toString();
    private static final MailAddress MAIL_ADDRESS = mock(MailAddress.class);

    private final MailClient mailClient = Mockito.mock(MailClient.class);
    private final ChatService chatService = Mockito.mock(ChatService.class);
    private final SmsGate smsGate = Mockito.mock(SmsGate.class);

    private final AuthenticationService service = Mockito.spy(new AuthenticationService(mailClient, chatService, smsGate));

    @Test
    void shouldSendSms() {
        given(service.twoFactorAuthentication(REQUEST)).willReturn(true);
        User user = mock(User.class);
        given(user.phoneNumber()).willReturn(PHONE_NUMBER);
        given(service.aUser()).willReturn(user);
        RandomCode randomCode = mock(RandomCode.class);
        given(randomCode.value()).willReturn(RANDOM_CODE_VALUE);
        given(service.aRandomCode()).willReturn(randomCode);

        service.login(REQUEST);

        then(smsGate).should().send(PHONE_NUMBER, RANDOM_CODE_VALUE);
    }

    @Test
    void shouldSendMail() {
        User user = mock(User.class);
        given(user.mail()).willReturn(MAIL_ADDRESS);
        given(service.aUser()).willReturn(user);
        given(service.twoFactorAuthentication(REQUEST)).willReturn(false);
        given(service.thirdFailedAttempt()).willReturn(true);

        service.login(REQUEST);

        then(mailClient).should().sendMail(expectedMail());
    }

    private Mail expectedMail() {
        return Mail.Builder.aMail(new MailAddress("application@app.com"), MAIL_ADDRESS)
                .title("Third failed try to login. Is that really you?")
                .content("Third failed try to login. Is that really you?")
                .build();
    }

    @Test
    void shouldChat() {
        User user = mock(User.class);
        given(service.aUser()).willReturn(user);
        given(service.twoFactorAuthentication(REQUEST)).willReturn(false);
        given(service.thirdFailedAttempt()).willReturn(false);
        given(service.successfulLogin()).willReturn(true);

        service.login(REQUEST);

        then(chatService).should().send(user, "Successful login.");
    }
}