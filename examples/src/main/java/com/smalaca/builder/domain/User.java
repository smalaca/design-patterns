package com.smalaca.builder.domain;

public class User {
    private final String login;
    private final String password;
    private final Name name;
    private final Address address;
    private Phone phone;
    private Mail mail;

    User(String login, String password, Name name, Address address) {

        this.login = login;
        this.password = password;
        this.name = name;
        this.address = address;
    }

    void add(Phone phone) {
        this.phone = phone;
    }

    void add(Mail mail) {
        this.mail = mail;
    }
}
