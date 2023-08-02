package com.microservices.project5.Bootcoin.service.impl;

import com.microservices.project5.Bootcoin.model.Transaction;
import com.microservices.project5.Bootcoin.repository.TransactionRepository;
import com.microservices.project5.Bootcoin.service.interf.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private final TransactionRepository transactionRepository;

    @Override
    public Mono<Transaction> createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public Flux<Transaction> getTransactionsByIdSender(String idSender, String state) {
        return transactionRepository.findByIdSenderAndState(idSender, state);
    }

    @Override
    public Flux<Transaction> getTransactionByIdReceiver(String idReceiver, String state) {
        return transactionRepository.findByIdReceiverAndState(idReceiver, state);
    }
}
