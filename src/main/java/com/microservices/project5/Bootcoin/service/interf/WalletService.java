package com.microservices.project5.Bootcoin.service.interf;

import com.microservices.project5.Bootcoin.model.Wallet;
import reactor.core.publisher.Mono;

public interface WalletService {
    Mono<Wallet> createWallet (Wallet wallet);
    Mono<Wallet> getWalletByDni (String dni);
}
