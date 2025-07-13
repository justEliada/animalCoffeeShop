package com.example.ecommerce.jpa.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String email;
    private String password;

    @Column(name = "created_at", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt = LocalDateTime.now();
}
