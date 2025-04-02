package com.example.ecommerce.jpa.entities;
import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;
@Entity
@Table(name = "pets")
public class Pets {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @Enumerated(EnumType.STRING)
    private PetType species; // ENUM: CAT, DOG, RABBIT, OTHER

    private int age;
    private String description;
    private String imageUrl;
}
