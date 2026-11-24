package com.ayush.backend.company.services.impl;

import com.ayush.backend.company.dtos.CompanyDto;
import com.ayush.backend.company.entities.CompanyEntity;
import com.ayush.backend.company.repositories.CompanyRepository;
import com.ayush.backend.company.services.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements ICompanyService {
    private final CompanyRepository companyRepository;

    @Override
    public List<CompanyDto> findAll() {
        List<CompanyEntity> companyEntities= this.companyRepository.findAll();

        return companyEntities
                .stream()
                .map(this::transformToDto)
                .collect(Collectors.toList());
    }

    private CompanyDto transformToDto(CompanyEntity companyEntity) {
        return new CompanyDto(companyEntity.getId(), companyEntity.getName(), companyEntity.getIndustry(), companyEntity.getNumEmployees(), companyEntity.getRating(), companyEntity.getDescription(), companyEntity.getWebsiteUrl(), companyEntity.getCreatedAt(), companyEntity.getUpdatedAt());
    }
}
