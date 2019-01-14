package com.smalaca.decorator.html;

public class Letter implements XmlNode {
    private final String value;

    public Letter(String value) {
        this.value = value;
    }

    @Override
    public String get() {
        return value;
    }
}
