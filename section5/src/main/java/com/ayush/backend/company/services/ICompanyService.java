package com.ayush.backend.company.services;

import com.ayush.backend.company.dtos.CompanyDto;
import com.ayush.backend.company.entities.CompanyEntity;

import java.util.List;

public interface ICompanyService {
    List<CompanyDto> findAll();
}
