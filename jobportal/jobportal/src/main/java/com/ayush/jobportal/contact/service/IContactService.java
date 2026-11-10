package com.ayush.jobportal.contact.service;

import com.ayush.jobportal.contact.dto.ContactDto;

import java.util.List;

public interface IContactService {
    boolean saveContact(ContactDto contactDto);
}
