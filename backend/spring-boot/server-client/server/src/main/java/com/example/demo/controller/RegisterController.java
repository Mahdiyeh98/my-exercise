package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("register")
public class RegisterController {

    UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    ResponseEntity<User> register(@RequestBody User user){
        return ResponseEntity.ok().body(userService.register(user));
    }


}
