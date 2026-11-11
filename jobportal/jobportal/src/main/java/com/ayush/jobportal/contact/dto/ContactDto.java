package com.ayush.jobportal.contact.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link com.ayush.jobportal.contact.entity.Contact}
 */
public record ContactDto(
        @NotBlank(message = "Name is required")
        @Size(min= 3, max= 100, message = "Name must be 3-100 characters long")
        String name,

        @NotBlank(message = "Email is required")
        @Size(max= 100, message = "Email must be at most 100 characters long")
        @Email()
        String email,

        @NotBlank(message = "Subject is required")
        @Size(min= 10, max= 255, message = "Subject must be 10-255 characters long")
        String subject,

        @NotBlank(message = "Message is required")
        @Size(min= 50, max= 1000, message = "Message must be 50-1000 characters long")
        String message,

        @NotBlank(message = "User type is required")
        @Size(min= 5, max= 20, message = "User type must be 5-20 characters long")
        @Pattern(regexp = "employee|employer|others", message = "User type must be one of: employee, employer, others")
        String userType
) implements Serializable {
}