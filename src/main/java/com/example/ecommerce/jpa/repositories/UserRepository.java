package com.example.ecommerce.jpa.repositories;

import com.example.ecommerce.jpa.entities.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<Customers, UUID> {
    Optional<Customers> findByEmail(String email);
}

