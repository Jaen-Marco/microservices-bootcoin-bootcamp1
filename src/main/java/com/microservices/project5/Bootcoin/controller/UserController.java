package com.microservices.project5.Bootcoin.controller;

import com.microservices.project5.Bootcoin.model.User;
import com.microservices.project5.Bootcoin.service.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bootcoin/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Mono<User> createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/{dni}")
    public Mono<User> getUserByDni(@PathVariable String dni){
        return userService.getUserByDni(dni);
    }

    @GetMapping("/{phoneNumber}")
    public Mono<User> getUserByPhoneNumber(@PathVariable String phoneNumber){
        return userService.getUserByPhoneNumber(phoneNumber);
    }
}
