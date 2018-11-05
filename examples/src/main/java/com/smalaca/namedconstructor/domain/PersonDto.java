package com.smalaca.namedconstructor.domain;

public class PersonDto {
    private String name;
    private String mumId;
    private String dadId;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String mumId() {
        return mumId;
    }

    public void setMumId(String mumId) {
        this.mumId = mumId;
    }

    public String dadId() {
        return dadId;
    }

    public void setDadId(String dadId) {
        this.dadId = dadId;
    }
}
