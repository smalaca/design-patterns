package com.smalaca.facade.report;

import com.smalaca.facade.chat.ChatService;
import com.smalaca.facade.domain.Mail;
import com.smalaca.facade.domain.MailAddress;
import com.smalaca.facade.domain.Report;
import com.smalaca.facade.domain.User;
import com.smalaca.facade.http.Request;
import com.smalaca.facade.mail.MailClient;

public class ReportsService {
    private static final MailAddress APPLICATION_MAIL_ADDRESS_ADDRESS = new MailAddress("application@app.com");

    private final MailClient mailClient;
    private final ChatService chatService;

    public ReportsService(MailClient mailClient, ChatService chatService) {
        this.mailClient = mailClient;
        this.chatService = chatService;
    }

    public void generateReport(Request request) {
        if (isNotValid(request)) {
            chatService.send(aUser(), "Request params are invalid. Correct and try again");
        }

        Report report = aReport(request);

        if (isNotValid(report)) {
            chatService.send(aUser(), "Could not generate a valid report.");
            String message = "There was a problem with correctness of report: " + report.trackingId();
            Mail mail = aMail(aProjectOwner(), message)
                    .content(message)
                    .build();

            mailClient.sendMail(mail);
        } else {
            Mail mail = aMail(aUser(), report.name())
                    .addAttachement(report)
                    .build();

            mailClient.sendMail(mail);
        }
    }

    private Mail.Builder aMail(User user, String title) {
        return Mail.Builder.aMail(APPLICATION_MAIL_ADDRESS_ADDRESS, user.mail())
                .title(title);
    }

    private User aProjectOwner() {
        return null;
    }

    private boolean isNotValid(Request request) {
        return false;
    }

    private User aUser() {
        return null;
    }

    private boolean isNotValid(Report report) {
        return false;
    }

    private Report aReport(Request request) {
        return null;
    }
}
