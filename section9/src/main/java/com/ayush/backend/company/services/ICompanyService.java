package com.ayush.backend.company.services;

import com.ayush.backend.company.dtos.CompanyRequestDto;
import com.ayush.backend.company.dtos.CompanyResponseDto;

import java.util.List;

public interface ICompanyService {
    boolean saveCompany(CompanyRequestDto companyRequestDto);
    List<CompanyResponseDto> findAll();
}
