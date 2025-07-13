package com.example.ecommerce.jpa.entities;

import com.example.ecommerce.jpa.commons.enums.LoyaltyType;
import jakarta.persistence.*;
import org.hibernate.sql.Update;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "pet_time_booking")
public class PetTimeBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Customers customerID;

    private Animals animalID;

    private LocalDateTime startTime;

    @Column(name="end_time", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime endTime;

    private float totalPrice;

    @Enumerated(EnumType.STRING)
    private LoyaltyType type;

}
