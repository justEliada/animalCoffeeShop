package com.example.ecommerce.jpa.entities;

import com.example.ecommerce.jpa.commons.enums.LoyaltyType;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "memberships")
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Customers customerId;
    private LoyaltyType loyaltyType;

    @Column(name = "membership_start_date", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime membershipStartDate = LocalDateTime.now();


}
