package com.ayush.backend.contact.services.impl;

import com.ayush.backend.contact.dtos.ContactDto;
import com.ayush.backend.contact.entities.ContactEntity;
import com.ayush.backend.contact.repositories.ContactRepository;
import com.ayush.backend.contact.services.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements IContactService {
    private final ContactRepository contactRepository;

    @Override
    public boolean saveContact(ContactDto contactDto) {
        ContactEntity contactEntity = this.contactRepository.save(this.transformToEntity(contactDto));
        return contactEntity.getId() != null;
    }

    private ContactEntity transformToEntity(ContactDto contactDto) {
        ContactEntity contactEntity= new ContactEntity();

        BeanUtils.copyProperties(contactDto, contactEntity);
        contactEntity.setCreatedAt(Instant.now());
        contactEntity.setUpdatedAt(Instant.now());

        return contactEntity;
    }
}
