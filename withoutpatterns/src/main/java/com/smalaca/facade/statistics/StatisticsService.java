package com.smalaca.facade.statistics;

import com.smalaca.facade.chat.ChatService;
import com.smalaca.facade.domain.Mail;
import com.smalaca.facade.domain.MailAddress;
import com.smalaca.facade.domain.Statistics;
import com.smalaca.facade.domain.User;
import com.smalaca.facade.http.Request;
import com.smalaca.facade.mail.MailClient;
import com.smalaca.facade.sms.SmsGate;

public class StatisticsService {
    private static final MailAddress APPLICATION_MAIL_ADDRESS_ADDRESS = new MailAddress("application@app.com");

    private final MailClient mailClient;
    private final ChatService chatService;
    private final SmsGate smsGate;

    public StatisticsService(MailClient mailClient, ChatService chatService, SmsGate smsGate) {
        this.mailClient = mailClient;
        this.chatService = chatService;
        this.smsGate = smsGate;
    }

    public void aStatisticsOf(Request request) {
        if (hasNoAccessRights(aUser())) {
            chatService.send(aUser(), "You have no access to this statistics.");
        }

        Statistics statistics = aStatisticsBasedOn(request);

        chatService.send(aUser(), "Statistics are successfully generated and sent.");

        Mail mail = Mail.Builder.aMail(APPLICATION_MAIL_ADDRESS_ADDRESS, aUser().mail())
                .title(statistics.link().value())
                .addAttachement(statistics)
                .build();

        mailClient.sendMail(mail);

        smsGate.send(aUser().phoneNumber(), statistics.link().value());
    }

    private Statistics aStatisticsBasedOn(Request request) {
        return null;
    }

    private boolean hasNoAccessRights(User user) {
        return false;
    }

    private User aUser() {
        return null;
    }
}
