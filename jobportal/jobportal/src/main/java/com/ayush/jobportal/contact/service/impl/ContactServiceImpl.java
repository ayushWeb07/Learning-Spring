package com.ayush.jobportal.contact.service.impl;

import com.ayush.jobportal.contact.dto.ContactDto;
import com.ayush.jobportal.contact.entity.Contact;
import com.ayush.jobportal.contact.repository.ContactRepository;
import com.ayush.jobportal.contact.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements IContactService {
    private final ContactRepository contactRepository;

    @Override
    public boolean saveContact(ContactDto contactDto) {
        Contact savedContact= this.contactRepository.save(this.transformToEntity(contactDto));

        return savedContact.getId() != null;
    }

    private Contact transformToEntity(ContactDto contactDto) {
        Contact contact= new Contact();

        contact.setName(contactDto.name());
        contact.setEmail(contactDto.email());
        contact.setSubject(contactDto.subject());
        contact.setMessage(contactDto.message());
        contact.setUserType(contactDto.userType());

        return contact;
    }
}
