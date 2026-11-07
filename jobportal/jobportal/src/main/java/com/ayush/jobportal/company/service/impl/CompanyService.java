package com.ayush.jobportal.company.service.impl;

import com.ayush.jobportal.company.dto.CompanyDto;
import com.ayush.jobportal.company.entity.Company;
import com.ayush.jobportal.company.repository.CompanyRepository;
import com.ayush.jobportal.company.service.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompanyService implements ICompanyService {
    private final CompanyRepository companyRepository;

    @Override
    public List<CompanyDto> findAll() {
        List<Company> companies= this.companyRepository.findAll();

        return companies.stream().map(this::transformToDto).collect(Collectors.toList());
    }

    private CompanyDto transformToDto(Company company) {
        return new CompanyDto(company.getId(), company.getName(), company.getIndustry(), company.getNumEmployees(), company.getRating(), company.getLocation(), company.getDescription(), company.getWebsiteUrl());
    }
}
