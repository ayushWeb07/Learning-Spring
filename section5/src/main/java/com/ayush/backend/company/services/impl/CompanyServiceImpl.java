package com.ayush.backend.company.services.impl;

import com.ayush.backend.company.entities.CompanyEntity;
import com.ayush.backend.company.repositories.CompanyRepository;
import com.ayush.backend.company.services.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements ICompanyService {
    private final CompanyRepository companyRepository;

    @Override
    public List<CompanyEntity> findAll() {
        return this.companyRepository.findAll();
    }
}
