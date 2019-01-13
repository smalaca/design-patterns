package com.smalaca.singleton.persistence;

import com.smalaca.singleton.security.Password;

class MySqlDatabaseConnectivity {
    private final ServerAddress serverAddress;
    private final String login;
    private final Password password;

    MySqlDatabaseConnectivity(ServerAddress serverAddress, String login, Password password) {
        this.serverAddress = serverAddress;
        this.login = login;
        this.password = password;
    }

    public void open() {

    }
}
