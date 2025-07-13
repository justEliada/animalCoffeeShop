package com.example.ecommerce.jpa.entities;

import com.example.ecommerce.jpa.commons.enums.LoyaltyType;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "memberships")
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customers customer;

    private LoyaltyType loyaltyType;

    //1. cust has 1 membership -> many transactions
    private List<LoyaltyTransactions> transactions = new ArrayList<>();

    @Column(name = "membership_start_date", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime membershipStartDate = LocalDateTime.now();


}
