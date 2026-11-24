package com.ayush.backend.company.services.impl;

import com.ayush.backend.company.entities.CompanyEntity;
import com.ayush.backend.company.repositories.CompanyRepository;
import com.ayush.backend.company.services.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements ICompanyService {
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository= companyRepository;
    }

    @Override
    public List<CompanyEntity> findAll() {
        return this.companyRepository.findAll();
    }
}
