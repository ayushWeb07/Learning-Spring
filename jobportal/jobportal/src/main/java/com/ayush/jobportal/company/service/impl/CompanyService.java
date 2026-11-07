package com.ayush.jobportal.company.service.impl;

import com.ayush.jobportal.company.entity.Company;
import com.ayush.jobportal.company.repository.CompanyRepository;
import com.ayush.jobportal.company.service.ICompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService implements ICompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> findAll() {
        return this.companyRepository.findAll();
    }
}
