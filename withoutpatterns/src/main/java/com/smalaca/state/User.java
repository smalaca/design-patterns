package com.smalaca.state;

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
        switch (state) {
            case ACTIVE:
                credentials.change(password);
                break;

            case BLOCKED:
                throw new RestrictedOperationException("Blocked users cannot change their password.");
        }
    }

    public void changeLogin(String login) {
        switch (state) {
            case ACTIVE:
                credentials.change(login);
                break;

            case BLOCKED:
                throw new RestrictedOperationException("Blocked users cannot change their login.");
        }
    }

    public void change(UserState state) {
        this.state = state;
    }
}
