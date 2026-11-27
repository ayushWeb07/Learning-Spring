package com.ayush.backend.company.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record CompanyRequestDto(
        @NotBlank(message = "Name is required")
        @Size(min = 3, max = 100, message = "Name must be 3-100 characters")
        String name,

        @NotBlank(message = "Industry is required")
        @Size(min = 3, max = 50, message = "Industry must be 3-50 characters")
        String industry,

        @NotNull(message = "Num. of employees is required")
        @Min(value = 1, message = "Employee size must be atleast 1")
        Long numEmployees,

        @NotNull(message = "Rating is required")
        BigDecimal rating,

        @NotBlank(message = "Description is required")
        @Size(min = 500, max = 2500, message = "Description must be 500-2500 characters")
        String description,

        @NotBlank(message = "Website url is required")
        @Size(min = 5, max = 300, message = "Website url must be 5-300 characters")
        String websiteUrl) {
}
