package com.smalaca.facade.statistics;

import com.smalaca.facade.domain.Statistics;
import com.smalaca.facade.domain.User;
import com.smalaca.facade.http.Request;
import com.smalaca.facade.notification.NotificationsFacade;

public class StatisticsService {
    private final NotificationsFacade notificationsFacade;

    public StatisticsService(NotificationsFacade notificationsFacade) {
        this.notificationsFacade = notificationsFacade;
    }

    public void aStatisticsOf(Request request) {
        if (hasNoAccessRights(aUser())) {
            notificationsFacade.sendChatMessage(aUser(), "You have no access to this statistics.");
        }

        Statistics statistics = aStatisticsBasedOn(request);

        notificationsFacade.sendChatMessage(aUser(), "Statistics are successfully generated and sent.");
        notificationsFacade.sendMail(aUser(), statistics);
        notificationsFacade.sendSms(aUser(), statistics.link());
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
