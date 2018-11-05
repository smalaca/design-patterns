package com.smalaca.namedconstructor.domain;

public class Person {
    private Name name;
    private Person mum;
    private Person dad;

    public static Person orphan(Name name) {
        return new Person(name);
    }

    public static Person withMum(Name name, Person mum) {
        Person person = new Person(name);
        person.mum = mum;
        return person;
    }

    public static Person withDad(Name name, Person dad) {
        Person person = new Person(name);
        person.dad = dad;
        return person;
    }

    public static Person withParents(Name name, Person mum, Person dad) {
        Person person = new Person(name);
        person.dad = dad;
        person.mum = mum;
        return person;
    }

    private Person(Name name) {
        this.name = name;
    }
}
