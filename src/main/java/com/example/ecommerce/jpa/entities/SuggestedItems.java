package com.example.ecommerce.jpa.entities;
import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;
@Entity
@Table(name = "suggestions")
public class SuggestedItems {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Products product;

    @ManyToOne
    @JoinColumn(name = "suggested_product_id", nullable = false)
    private Products suggestedProduct;
}

