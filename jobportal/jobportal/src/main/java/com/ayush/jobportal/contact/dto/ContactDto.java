package com.ayush.jobportal.contact.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.ayush.jobportal.contact.entity.Contact}
 */
public record ContactDto(String name, String email, String subject, String message,
                         String userType) implements Serializable {
}