package com.wds.example.htlw.rest;

import com.wds.example.htlw.domain.Person;
import com.wds.example.htlw.persistence.PersonRepository;

import org.springframework.web.bind.annotation.*;


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
    @PostMapping("persons")
    public Person postPersons(@RequestBody Person personToInsert) {
        personRepository.save(personToInsert);
        return personToInsert;
    }
    @GetMapping("persons/{id}")
    public Person getPersonById(@PathVariable int id) {

        return personRepository.findById(id)
                .orElse( null);
    }
    @DeleteMapping("persons/{id]")
    public void deletePerson(@PathVariable int id){
        personRepository.deleteById(id);
    }
    @PutMapping("persons")
    public Person putPerson(@RequestBody Person updatedPerson){
        return personRepository.save(updatedPerson);
    }

}