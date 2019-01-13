package com.smalaca.singleton.persistence;

import com.smalaca.singleton.application.request.Input;
import com.smalaca.singleton.security.Password;

public class PersistenceManager {
    private final ServerAddress serverAddress;
    private final String login;
    private final Password password;

    public PersistenceManager(ServerAddress serverAddress, String login, Password password) {
        this.serverAddress = serverAddress;
        this.login = login;
        this.password = password;
    }

    public void process(Input input) {
        MySqlDatabaseConnectivity connectivity = aConnectivity();
        connectivity.open();

        // some functionality
    }

    private MySqlDatabaseConnectivity aConnectivity() {
        return new MySqlDatabaseConnectivity(serverAddress, login, password);
    }
}
