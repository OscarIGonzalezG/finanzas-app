package com.finanzasapp.backend.service.impl;

import com.finanzasapp.backend.entity.Person;
import com.finanzasapp.backend.repository.PersonRepository;
import com.finanzasapp.backend.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implementación del servicio de personas.
 * Contiene la lógica de negocio relacionada con la entidad Person
 */
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAll(){
        return personRepository.findAll();
    }

    @Override
    public Person getById(Long id){
        Optional<Person> person = personRepository.findById(id);
        return person.orElse(null);
    }

    @Override
    public Person create(Person person){
        return personRepository.save(person);
    }

    @Override
    public void delete(Long id){
        personRepository.deleteById(id);
    }
}
