package com.smalaca.singleton.statistics;

import com.smalaca.singleton.persistence.ServerAddress;
import com.smalaca.singleton.security.Password;

class StatisticsService {
    private final String login;
    private final Password password;
    private final ServerAddress serverAddress;

    StatisticsService(String login, Password password, ServerAddress serverAddress) {
        this.login = login;
        this.password = password;
        this.serverAddress = serverAddress;
    }

    public void connect() {

    }
}
