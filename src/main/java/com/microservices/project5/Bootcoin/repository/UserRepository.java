package com.microservices.project5.Bootcoin.repository;

import com.microservices.project5.Bootcoin.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {
    Mono<User> findByDni (String dni);
    Mono<User> findByPhoneNumber (String phoneNumber);
}
