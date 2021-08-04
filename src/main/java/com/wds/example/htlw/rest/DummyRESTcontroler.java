package com.wds.example.htlw.rest;

import com.wds.example.htlw.domain.Person;
import com.wds.example.htlw.persistence.PersonRepository;
import lombok.var;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class DummyRESTcontroler {

    private final PersonRepository personRepository;

    public DummyRESTcontroler(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("persons")
    public List<Person> getPersons() {
        var persons = new ArrayList<Person>();
        for (Person person : personRepository.findAll()) {
            persons.add(person);
        }
        return persons;
    }
}