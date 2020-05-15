package com.smalaca.builder.domain;

public class UserBuilder {
    private String firstName;
    private String lastName;
    private String street;
    private String postalCode;
    private String city;
    private String country;
    private String login;
    private String password;
    private String phone;
    private String mail;

    public UserBuilder withName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withAddress(String street, String postalCode, String city, String country) {
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        return this;
    }

    public UserBuilder withLogin(String login) {
        this.login = login;
        return this;
    }

    public UserBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder withMail(String mail) {
        this.mail = mail;
        return this;
    }

    public User build() {
        User user = new User(login, password, new Name(firstName, lastName), new Address(street, postalCode, city, country));

        if (phone != null) {
            user.add(new Phone(phone));
        }

        if (mail != null) {
            user.add(new Mail(mail));
        }

        return user;
    }
}
