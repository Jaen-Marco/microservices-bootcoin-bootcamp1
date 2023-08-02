package com.microservices.project5.Bootcoin.repository;

import com.microservices.project5.Bootcoin.model.Transaction;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface TransactionRepository extends ReactiveCrudRepository<Transaction, Long> {
    Flux<Transaction> findByIdSenderAndState (String idSender, String idReceiver);
    Flux<Transaction> findByIdReceiverAndState (String idReceiver, String state);
}
