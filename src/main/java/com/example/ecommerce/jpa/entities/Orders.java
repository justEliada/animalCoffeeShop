package com.example.ecommerce.jpa.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "oders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Customers customerId;

    private List<OrderItems> items = new ArrayList<>();

    @Column(name = "oder_time", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime orderTime = LocalDateTime.now();

    private float price;

}
