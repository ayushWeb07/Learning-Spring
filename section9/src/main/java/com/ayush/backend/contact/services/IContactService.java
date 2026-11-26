package com.ayush.backend.contact.services;

import com.ayush.backend.contact.dtos.ContactDto;

import java.util.List;

public interface IContactService {
    boolean saveContact(ContactDto contactDto);
    List<ContactDto> findAll();
}
