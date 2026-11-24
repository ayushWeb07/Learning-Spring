package com.ayush.backend.contact.services;

import com.ayush.backend.contact.dtos.ContactDto;

public interface IContactService {
    boolean saveContact(ContactDto contactDto);
}
