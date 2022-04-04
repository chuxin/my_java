package com.example.demo.fmConfig.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.fmConfig.Person;

public class PersonServiceImpl implements PersonService {
    @Autowired
    private Person person;

    @Override
    public Person getPersonInfo() {
        return person;
    }
}
