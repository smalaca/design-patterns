package com.smalaca.facade.report;

import com.smalaca.facade.domain.Report;
import com.smalaca.facade.domain.User;
import com.smalaca.facade.http.Request;
import com.smalaca.facade.notification.NotificationsFacade;

public class ReportsService {
    private final NotificationsFacade notificationsFacade;

    public ReportsService(NotificationsFacade notificationsFacade) {
        this.notificationsFacade = notificationsFacade;
    }

    public void generateReport(Request request) {
        if (isNotValid(request)) {
            notificationsFacade.sendChatMessage(aUser(), "Request params are invalid. Correct and try again");
        }

        Report report = aReport(request);

        if (isNotValid(report)) {
            notificationsFacade.sendChatMessage(aUser(), "Could not generate a valid report.");
            notificationsFacade.sendMail(aProjectOwner(), "There was a problem with correctness of report: " + report.trackingId());
        } else {
            notificationsFacade.sendMail(aUser(), report);
        }
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
