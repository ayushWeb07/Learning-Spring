package com.ayush.backend.company.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "companies")
@Getter
@Setter
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", unique = true, nullable = false, length = 100)
    private String name;

    @Column(name = "industry", nullable = false, length = 50)
    private String industry;

    @Column(name = "num_employees", nullable = false)
    private Long numEmployees;

    @Column(name = "rating", nullable = false, precision = 3, scale = 2)
    private BigDecimal rating;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "website_url", nullable = false, unique = true, length = 300)
    private String websiteUrl;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false, updatable = true)
    private Instant updatedAt;
}
