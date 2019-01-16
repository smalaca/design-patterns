package com.smalaca.state.auth;

import com.smalaca.state.auth.state.UserState;

public class User {
    private final String name;
    private final Credentials credentials;
    private UserState state;

    public User(String name, Credentials credentials, UserState state) {
        this.name = name;
        this.credentials = credentials;
        this.state = state;
    }

    public void changePassword(Password password) {
        state.modifyPassword(credentials, password);
    }

    public void changeLogin(String login) {
        state.modifyLogin(credentials, login);
    }

    public void change(UserState state) {
        this.state = state;
    }
}
