package com.ayush.jobportal.contact.controller;

import com.ayush.jobportal.contact.dto.ContactDto;
import com.ayush.jobportal.contact.service.IContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v{version}/contacts")
@RequiredArgsConstructor
public class ContactController {
    private final IContactService contactService;

    @PostMapping(version = "1.0")
    public ResponseEntity<String> saveContact(@RequestBody @Valid ContactDto contactDto) {
        boolean isContactSaved= this.contactService.saveContact(contactDto);

        if (!isContactSaved) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong while processing your contact request");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body("Your contact request has been successfully created");
    }
}
