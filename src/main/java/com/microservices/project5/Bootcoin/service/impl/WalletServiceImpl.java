package com.microservices.project5.Bootcoin.service.impl;

import com.microservices.project5.Bootcoin.model.Wallet;
import com.microservices.project5.Bootcoin.repository.WalletRepository;
import com.microservices.project5.Bootcoin.service.interf.WalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    private final WalletRepository walletRepository;

    @Override
    public Mono<Wallet> createWallet(Wallet wallet) {
        return walletRepository.save(wallet);
    }

    @Override
    public Mono<Wallet> getWalletByDni(String dni) {
        return walletRepository.findByDni(dni);
    }
}
