package com.smalaca.singleton.persistence;

import com.smalaca.singleton.application.config.ApplicationConfiguration;
import com.smalaca.singleton.application.request.Input;
import com.smalaca.singleton.security.Password;

public class PersistenceManager {
    public void process(Input input) {
        MySqlDatabaseConnectivity connectivity = aConnectivity();
        connectivity.open();

        // some functionality
    }

    private MySqlDatabaseConnectivity aConnectivity() {
        ApplicationConfiguration configuration = ApplicationConfiguration.anInstance();

        ServerAddress serverAddress = configuration.aServerAddress("db.mysql");
        String login = configuration.aLogin();
        Password password = configuration.aPassword();

        return new MySqlDatabaseConnectivity(serverAddress, login, password);
    }
}
