package com.microservices.project5.Bootcoin.service.interf;

import com.microservices.project5.Bootcoin.model.User;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> createUser (User user);
    Mono<User> getUserByDni (String dni);
    Mono<User> getUserByPhoneNumber (String phoneNumber);
}
