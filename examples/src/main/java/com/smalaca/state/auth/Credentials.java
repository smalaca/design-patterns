package com.smalaca.state.auth;

public interface Credentials {
    void change(Password password);

    void change(String login);
}
