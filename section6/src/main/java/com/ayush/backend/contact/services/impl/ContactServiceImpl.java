package com.ayush.backend.contact.services.impl;

import com.ayush.backend.contact.dtos.ContactDto;
import com.ayush.backend.contact.entities.ContactEntity;
import com.ayush.backend.contact.enums.ContactStatus;
import com.ayush.backend.contact.repositories.ContactRepository;
import com.ayush.backend.contact.services.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements IContactService {
    private final ContactRepository contactRepository;

    @Override
    public boolean saveContact(ContactDto contactDto) {
        ContactEntity contactEntity= this.transformToEntity(contactDto);
        contactEntity.setContactStatus(ContactStatus.NEW);

        ContactEntity savedContactEntity = this.contactRepository.save(contactEntity);
        return savedContactEntity.getId() != null;
    }

    @Override
    public List<ContactDto> findAll() {
        List<ContactEntity> contacts= this.contactRepository.findAll();
        return contacts.stream().map(this::transformToDto).collect(Collectors.toList());
    }

    private ContactDto transformToDto(ContactEntity contactEntity) {
        return new ContactDto(
                contactEntity.getName(),
                contactEntity.getEmail(),
                contactEntity.getSubject(),
                contactEntity.getMessage()
        );
    }

    private ContactEntity transformToEntity(ContactDto contactDto) {
        ContactEntity contactEntity= new ContactEntity();

        BeanUtils.copyProperties(contactDto, contactEntity);
        contactEntity.setCreatedAt(Instant.now());
        contactEntity.setUpdatedAt(Instant.now());

        return contactEntity;
    }
}
