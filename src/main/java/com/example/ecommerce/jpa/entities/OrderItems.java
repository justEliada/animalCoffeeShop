package com.example.ecommerce.jpa.entities;
import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "order_items")
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order orderI;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Products productId;

    private int quantity;
    private BigDecimal price;
}
