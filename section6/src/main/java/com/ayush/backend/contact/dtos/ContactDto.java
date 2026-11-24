package com.ayush.backend.contact.dtos;

import java.io.Serializable;

/**
 * DTO for {@link com.ayush.backend.contact.entities.ContactEntity}
 */
public record ContactDto(String name, String email, String subject, String message) implements Serializable {
}