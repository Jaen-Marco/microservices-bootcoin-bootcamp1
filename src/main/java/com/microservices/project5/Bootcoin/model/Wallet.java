package com.microservices.project5.Bootcoin.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "wallet-bootcoin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Wallet {
    private Long id;
    private String dni;
    private Double balanceBootCoin;
}
