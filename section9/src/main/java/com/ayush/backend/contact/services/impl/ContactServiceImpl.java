package com.ayush.backend.contact.services.impl;

import com.ayush.backend.contact.dtos.ContactRequestDto;
import com.ayush.backend.contact.dtos.ContactResponseDto;
import com.ayush.backend.contact.entities.ContactEntity;
import com.ayush.backend.contact.enums.ContactStatus;
import com.ayush.backend.contact.repositories.ContactRepository;
import com.ayush.backend.contact.services.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements IContactService {
    private final ContactRepository contactRepository;

    @Override
    public boolean saveContact(ContactRequestDto contactRequestDto) {
        ContactEntity contactEntity= this.transformContactRequestDtoToEntity(contactRequestDto);

        ContactEntity savedContactEntity = this.contactRepository.save(contactEntity);
        return savedContactEntity.getId() != null;
    }

    @Override
    public List<ContactResponseDto> findAll() {
        List<ContactEntity> contacts= this.contactRepository.findAll();
        return contacts
                .stream()
                .map(this::transformEntityToResponseDto)
                .collect(Collectors.toList());
    }

    private ContactResponseDto transformEntityToResponseDto(ContactEntity contactEntity) {
        return new ContactResponseDto(
                contactEntity.getId(),
                contactEntity.getName(),
                contactEntity.getEmail(),
                contactEntity.getSubject(),
                contactEntity.getMessage(),
                contactEntity.getContactStatus(),
                contactEntity.getCreatedAt(),
                contactEntity.getCreatedBy(),
                contactEntity.getUpdatedAt(),
                contactEntity.getUpdatedBy()
        );
    }

    private ContactEntity transformContactRequestDtoToEntity(ContactRequestDto contactRequestDto) {
        ContactEntity contactEntity= new ContactEntity();
        BeanUtils.copyProperties(contactRequestDto, contactEntity);

        return contactEntity;
    }
}
