package com.example.ecommerce.jpa.entities;
import com.example.ecommerce.jpa.commons.enums.PetType;
import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table(name = "animals")
public class Animals {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @Enumerated(EnumType.STRING)
    private PetType breed; // ENUM: CAT, DOG, RABBIT, OTHER

    private int age;
    private String description;
    private Boolean availability;

    @Lob
    @Column(name = "petImage") // saving image as blob
    private byte[] petImage;}
