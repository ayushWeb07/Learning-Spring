package com.ayush.jobportal.company.service;

import com.ayush.jobportal.company.dto.CompanyDto;

import java.util.List;

public interface ICompanyService {
    List<CompanyDto> findAll();
}
