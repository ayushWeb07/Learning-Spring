package com.ayush.backend.contact.dtos;

import com.ayush.backend.contact.enums.ContactStatus;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

/**
 * DTO for {@link com.ayush.backend.contact.entities.ContactEntity}
 */
public record ContactResponseDto(
        UUID id,
        String name,
        String email,
        String subject,
        String message,
        ContactStatus contactStatus,
        Instant createdAt,
        String createdBy,
        Instant updatedAt,
        String updatedBy) implements Serializable {
}