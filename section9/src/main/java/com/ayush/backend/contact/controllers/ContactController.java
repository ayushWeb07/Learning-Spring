package com.ayush.backend.contact.controllers;

import com.ayush.backend.contact.dtos.ContactRequestDto;
import com.ayush.backend.contact.dtos.ContactResponseDto;
import com.ayush.backend.contact.services.IContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
@RequiredArgsConstructor
public class ContactController {
    private final IContactService contactService;

    @GetMapping
    public ResponseEntity<List<ContactResponseDto>> getAllContacts() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.contactService.findAll());
    }


    @PostMapping
    public ResponseEntity<String> saveContact(@RequestBody @Valid ContactRequestDto contactRequestDto) {
        boolean isContactSaved= this.contactService.saveContact(contactRequestDto);

        if (!isContactSaved) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to save the contact");
        }

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Successfully saved the contact");
    }
}
