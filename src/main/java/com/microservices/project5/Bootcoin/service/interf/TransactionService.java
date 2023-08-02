package com.microservices.project5.Bootcoin.service.interf;

import com.microservices.project5.Bootcoin.model.Transaction;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionService {

    Mono<Transaction> createTransaction (Transaction transaction);
    Flux<Transaction> getTransactionsByIdSender (String idSender, String state);
    Flux<Transaction> getTransactionByIdReceiver (String idReceiver, String state);
}
