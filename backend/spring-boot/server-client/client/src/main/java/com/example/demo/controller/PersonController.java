package com.example.demo.controller;

import com.example.demo.client.UserSerivceClient;
import com.example.demo.domain.Person;
import com.example.demo.dto.UserDto;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    UserSerivceClient userSerivceClient;

    @Autowired
    PersonRepository personRepository;

    @GetMapping("{nationalCode}")
    UserDto findNationalCode(@PathVariable String nationalCode)
    {
        return userSerivceClient.findUser(nationalCode);
    }

    @PostMapping()
    Person save(@RequestBody Person person)
    {
        UserDto user = userSerivceClient.findUser(person.getNationalCode());
        person.setName(user.getName());
        person.setFamily(user.getFamily());
        return personRepository.save(person);

    }
}
