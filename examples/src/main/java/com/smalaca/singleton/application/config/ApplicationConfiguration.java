package com.smalaca.singleton.application.config;

import com.smalaca.singleton.auth.domain.User;
import com.smalaca.singleton.persistence.ServerAddress;
import com.smalaca.singleton.security.Password;

public class ApplicationConfiguration {
    private static final ApplicationConfiguration INSTANCE = new ApplicationConfiguration();

    private ApplicationConfiguration() {}

    public static ApplicationConfiguration anInstance() {
        return INSTANCE;
    }

    public ServerAddress aServerAddress(String s) {
        return null;
    }

    public String aLogin() {
        return null;
    }

    public Password aPassword() {
        return null;
    }

    public User aLoggedUser() {
        return null;
    }
}
