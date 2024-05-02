package com.example.projectt2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectt2.entity.Person;
import com.example.projectt2.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository pRepo;
    public void save(Person p){
        pRepo.save(p);

    }
    public List<Person> getAllPerson(){
        return pRepo.findAll();
    }

    public Person getPersonById(int id) {
        return pRepo.findById(id).get();
    }
    public void deleteById(int id) {
        pRepo.deleteById(id);
    }
}
