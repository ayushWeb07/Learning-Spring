package com.ayush.backend.company.services.impl;

import com.ayush.backend.company.dtos.CompanyRequestDto;
import com.ayush.backend.company.dtos.CompanyResponseDto;
import com.ayush.backend.company.entities.CompanyEntity;
import com.ayush.backend.company.repositories.CompanyRepository;
import com.ayush.backend.company.services.ICompanyService;
import com.ayush.backend.job.dtos.JobDto;
import com.ayush.backend.job.entities.JobEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements ICompanyService {
    private final CompanyRepository companyRepository;

    @Override
    public boolean saveCompany(CompanyRequestDto companyRequestDto) {
        CompanyEntity companyEntity= this.transformCompanyRequestDtoToEntity(companyRequestDto);
        CompanyEntity savedCompanyEntity = this.companyRepository.save(companyEntity);
        return savedCompanyEntity.getId() != null;
    }

    @Override
    public List<CompanyResponseDto> findAll() {
        List<CompanyEntity> companyEntities= this.companyRepository.findAll();

        return companyEntities
                .stream()
                .map(this::transformEntityToResponseDto)
                .collect(Collectors.toList());
    }

    private CompanyEntity transformCompanyRequestDtoToEntity(CompanyRequestDto companyRequestDto) {
        CompanyEntity companyEntity= new CompanyEntity();
        BeanUtils.copyProperties(companyRequestDto, companyEntity);

        return companyEntity;
    }

    private CompanyResponseDto transformEntityToResponseDto(CompanyEntity companyEntity) {
        return new CompanyResponseDto(
                companyEntity.getId(),
                companyEntity.getName(),
                companyEntity.getIndustry(),
                companyEntity.getNumEmployees(),
                companyEntity.getRating(),
                companyEntity.getDescription(),
                companyEntity.getWebsiteUrl(),
                companyEntity.getCreatedAt(),
                companyEntity.getCreatedBy(),
                companyEntity.getUpdatedAt(),
                companyEntity.getUpdatedBy());
    }
}
