package com.microservices.project5.Bootcoin.controller;

import com.microservices.project5.Bootcoin.model.Wallet;
import com.microservices.project5.Bootcoin.service.interf.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bootcoin/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @PostMapping
    public Mono<Wallet> createWallet(@RequestBody Wallet wallet){
        return walletService.createWallet(wallet);
    }

    @GetMapping("/{dni}")
    public Mono<Wallet> getWalletByDni(@PathVariable String dni){
        return walletService.getWalletByDni(dni);
    }
}
