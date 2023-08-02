package com.microservices.project5.Bootcoin.service.impl;

import com.microservices.project5.Bootcoin.model.User;
import com.microservices.project5.Bootcoin.repository.UserRepository;
import com.microservices.project5.Bootcoin.service.interf.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    @Override
    public Mono<User> createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Mono<User> getUserByDni(String dni) {
        return userRepository.findByDni(dni);
    }

    @Override
    public Mono<User> getUserByPhoneNumber(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber);
    }
}
