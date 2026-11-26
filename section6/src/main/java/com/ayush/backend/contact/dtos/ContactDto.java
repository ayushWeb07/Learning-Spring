package com.ayush.backend.contact.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link com.ayush.backend.contact.entities.ContactEntity}
 */
public record ContactDto(
        @NotBlank(message = "Name is required")
        @Size(min = 3, max = 100, message = "Name must be 3-100 characters")
        String name,

        @NotBlank(message = "Email is required")
        @Size(min = 3, max = 100, message = "Email must be 3-100 characters")
        @Email(message = "Email must be a valid one")
        String email,

        @NotBlank(message = "Subject is required")
        @Size(min = 30, max = 255, message = "Subject must be 30-255 characters")
        String subject,

        @NotBlank(message = "Message is required")
        @Size(min = 100, max = 500, message = "Message must be 100-500 characters")
        String message) implements Serializable {
}