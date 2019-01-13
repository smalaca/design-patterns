package com.smalaca.singleton.statistics;

import com.smalaca.singleton.application.request.Input;
import com.smalaca.singleton.persistence.ServerAddress;
import com.smalaca.singleton.security.Password;

public class StatisticsManager {
    private final String login;
    private final Password password;
    private final ServerAddress serverAddress;

    private StatisticsService statisticsService;

    public StatisticsManager(String login, Password password, ServerAddress serverAddress) {

        this.login = login;
        this.password = password;
        this.serverAddress = serverAddress;
    }

    public void process(Input input) {
        StatisticsService statisticsService = aStatisticsService();

        // some functionality
    }

    private StatisticsService aStatisticsService() {
        if(statisticsService == null) {
            statisticsService = new StatisticsService(login, password, serverAddress);
            statisticsService.connect();
        }

        return statisticsService;
    }
}
