package com.ayush.backend.company.dtos;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record CompanyDto(UUID id, String name, String industry, Long numEmployees, BigDecimal rating, String description, String websiteUrl, Instant createdAt, Instant updatedAt) {
}
