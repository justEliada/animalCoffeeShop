package com.example.ecommerce.jpa.entities;

import com.example.ecommerce.jpa.commons.enums.TransactionType;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "loyalty_transations")
public class LoyaltyTransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;

    private Membership membershipId;
    private TransactionType transactionType;
    private int points;

    private LocalDateTime transactionDate = LocalDateTime.now();

}
