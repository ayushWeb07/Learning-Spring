package com.ayush.backend.contact.services;

import com.ayush.backend.contact.dtos.ContactRequestDto;
import com.ayush.backend.contact.dtos.ContactResponseDto;

import java.util.List;

public interface IContactService {
    boolean saveContact(ContactRequestDto contactRequestDto);
    List<ContactResponseDto> findAll();
}
