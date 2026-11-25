package com.ayush.backend.contact.entities;

import com.ayush.backend.contact.enums.ContactStatus;
import com.ayush.backend.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "contacts")
@Getter
@Setter
public class ContactEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "subject", nullable = false, length = 255)
    private String subject;

    @Column(name = "message", nullable = false, columnDefinition = "TEXT")
    @Lob
    private String message;

    @Enumerated(EnumType.STRING)
    @Column(name = "contact_status", nullable = false)
    private ContactStatus contactStatus;
}
