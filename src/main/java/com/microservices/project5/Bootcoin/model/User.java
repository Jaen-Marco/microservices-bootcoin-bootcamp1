package com.microservices.project5.Bootcoin.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user-bootcoin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String dni;
    private String phoneNumber;
    private String email;
}
