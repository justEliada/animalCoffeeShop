package com.example.ecommerce.jpa.entities;

import com.example.ecommerce.jpa.commons.enums.RatingType;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "reviews")
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Customers customerId;
    private RatingType ratingType;

    private Animals animalId;
    private OrderItems oderItemsId;
    private LocalDateTime reviewDate = LocalDateTime.now();

}
