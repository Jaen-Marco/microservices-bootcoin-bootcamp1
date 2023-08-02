package com.microservices.project5.Bootcoin.controller;

import com.microservices.project5.Bootcoin.model.Transaction;
import com.microservices.project5.Bootcoin.service.interf.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bootcoin/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Mono<Transaction> createT(@RequestBody Transaction transaction){
        return transactionService.createTransaction(transaction);
    }

    @GetMapping("/emisor/{idSender}/{state}")
    public Flux<Transaction> getTransactionsBySender(@PathVariable String idSender, @PathVariable String state){
        return transactionService.getTransactionsByIdSender(idSender, state);
    }

    @GetMapping("/receptor/{idReceiver}/{state}")
    public Flux<Transaction> getTransactionsByReceiver(@PathVariable String idReceiver, @PathVariable String state){
        return transactionService.getTransactionByIdReceiver(idReceiver, state);
    }
}
