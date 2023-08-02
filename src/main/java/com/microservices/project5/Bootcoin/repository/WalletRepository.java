package com.microservices.project5.Bootcoin.repository;

import com.microservices.project5.Bootcoin.model.Wallet;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface WalletRepository extends ReactiveCrudRepository<Wallet, Long> {
    Mono<Wallet> findByDni(String dni);
}
