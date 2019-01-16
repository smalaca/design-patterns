package com.smalaca.state;

public interface Credentials {
    void change(Password password);

    void change(String login);
}
