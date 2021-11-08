package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {


    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping()
    List<User> users()
    {
        return userRepository.findAll();
    }

    @GetMapping("{nationalCode}")
    User findUser(@PathVariable String nationalCode ){
        return userRepository.findByNationalCode(nationalCode);
    }
}
