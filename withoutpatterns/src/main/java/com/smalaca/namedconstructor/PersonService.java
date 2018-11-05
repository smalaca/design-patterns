package com.smalaca.namedconstructor;

import com.smalaca.namedconstructor.domain.Name;
import com.smalaca.namedconstructor.domain.Person;
import com.smalaca.namedconstructor.domain.PersonDto;

import java.util.Optional;

public class PersonService {
    public Person createPerson(PersonDto personDto) {
        Optional<Person> mum = findPersonWith(personDto.mumId());
        Optional<Person> dad = findPersonWith(personDto.dadId());
        Name name = new Name(personDto.name());

        if (mum.isPresent() && dad.isPresent()) {
            return new Person(name, mum.get(), dad.get());
        } else if (mum.isPresent()) {
            return new Person(name, mum.get());
        } else if (dad.isPresent()) {
            return null;
//            return new Person(name, dad.get());
        } else {
            return new Person(name);
        }
    }

    private Optional<Person> findPersonWith(String personId) {
        return Optional.empty();
    }
}
