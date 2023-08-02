package com.microservices.project5.Bootcoin.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaction-bootcoin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    private Long id;
    private String idSender;
    private String idReceiver;
    private Double amount;
    private String payMode;
    private String state;
}
