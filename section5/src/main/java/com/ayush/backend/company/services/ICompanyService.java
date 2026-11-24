package com.ayush.backend.company.services;

import com.ayush.backend.company.entities.CompanyEntity;

import java.util.List;

public interface ICompanyService {
    List<CompanyEntity> findAll();
}
