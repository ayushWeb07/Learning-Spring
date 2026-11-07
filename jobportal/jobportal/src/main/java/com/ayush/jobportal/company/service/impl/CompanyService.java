package com.ayush.jobportal.company.service.impl;

import com.ayush.jobportal.company.entity.Company;
import com.ayush.jobportal.company.repository.CompanyRepository;
import com.ayush.jobportal.company.service.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService implements ICompanyService {
    private final CompanyRepository companyRepository;

    @Override
    public List<Company> findAll() {
        return this.companyRepository.findAll();
    }
}
