package com.example.ecommerce.jpa.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "oders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;
    private Customers customerID;
    private Date ordeTime;
    private float price;

}
