package com.smalaca.builder.domain;

public class Mail {
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mail mail1 = (Mail) o;

        return mail != null ? mail.equals(mail1.mail) : mail1.mail == null;
    }

    @Override
    public int hashCode() {
        return mail != null ? mail.hashCode() : 0;
    }
}
