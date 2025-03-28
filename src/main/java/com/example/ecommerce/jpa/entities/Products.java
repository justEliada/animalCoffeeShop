package com.example.ecommerce.jpa.entities;

import jakarta.persistence.*;
import jdk.jfr.Category;

import java.math.BigDecimal;
import java.util.UUID;
@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String description;
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private Category category; // ENUM: COFFEE, FOOD, ANIMAL_FOOD, MERCH

    private int stock;
    private String imageUrl;
}