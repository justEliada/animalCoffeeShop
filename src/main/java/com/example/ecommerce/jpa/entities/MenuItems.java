package com.example.ecommerce.jpa.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "menu_items")
public class MenuItems {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private int price;
    private
}
