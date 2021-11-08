package com.mahdiyeh.dss.sales.dao;

import com.mahdiyeh.dss.sales.model.Person;

import java.util.List;

public interface PersonDao {
    List<Person> findAllPersons();
    Person getPersonById(int id);
    Person getPersonByUsername(String username);
    void insertPerson(Person person);
    void updatePerson(Person person);
    void deletePerson(Person person);
}
