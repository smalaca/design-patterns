package com.smalaca.builder.domain;

import com.smalaca.builder.domain.exception.DataConsistencyViolatedException;

import java.util.Objects;

import static java.util.Arrays.stream;

public class UserBuilder {
    private final String login;
    private final String password;

    private Name name;
    private Address address;
    private Phone phone;
    private Mail mail;

    public UserBuilder(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserBuilder withName(String firstName, String lastName) {
        if (anyNull(firstName, lastName)) {
            throw new DataConsistencyViolatedException();
        }

        name = new Name(firstName, lastName);

        return this;
    }

    public UserBuilder withAddress(String street, String postalCode, String city, String country) {
        if (anyNull(street, postalCode, city, country)) {
            throw new DataConsistencyViolatedException();
        }

        address = new Address(street, postalCode, city, country);

        return this;
    }

    private boolean anyNull(String ... values) {
        return stream(values).anyMatch(Objects::isNull);
    }

    public void withPhone(String phone) {
        this.phone = new Phone(phone);
    }

    public void withMail(String mail) {
        this.mail = new Mail(mail);
    }

    public User build() {
        User user = new User(login, password, name, address);

        if (phone != null) {
            user.add(phone);
        }

        if (mail != null) {
            user.add(mail);
        }

        return user;
    }
}
