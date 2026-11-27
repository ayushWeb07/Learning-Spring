package com.ayush.backend.company.dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record CompanyResponseDto(
        UUID id,
        String name,
        String industry,
        Long numEmployees,
        BigDecimal rating,
        String description,
        String websiteUrl,
        Instant createdAt,
        String createdBy,
        Instant updatedAt,
        String updatedBy) implements Serializable {
}