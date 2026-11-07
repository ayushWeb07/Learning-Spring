package com.ayush.jobportal.company.service;

import com.ayush.jobportal.company.entity.Company;

import java.util.List;

public interface ICompanyService {
    List<Company> findAll();
}
