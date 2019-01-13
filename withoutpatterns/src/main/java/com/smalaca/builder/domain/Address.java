package com.smalaca.builder.domain;

public class Address {
    private final String street;
    private final String postalCode;
    private final String city;
    private final String country;

    public Address(String street, String postalCode, String city, String country) {
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }
}
