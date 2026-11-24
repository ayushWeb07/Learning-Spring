package com.ayush.backend.contact.controllers;

import com.ayush.backend.contact.dtos.ContactDto;
import com.ayush.backend.contact.services.IContactService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contacts")
@RequiredArgsConstructor
public class ContactController {
    private final IContactService contactService;

    @PostMapping
    public ResponseEntity<String> saveContact(@RequestBody ContactDto contactDto) {
        boolean isContactSaved= this.contactService.saveContact(contactDto);

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
