package com.ayush.backend.company.controllers;

import com.ayush.backend.company.entities.CompanyEntity;
import com.ayush.backend.company.services.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {
    private final ICompanyService companyService;

    @Autowired
    public CompanyController(ICompanyService companyService) {
        this.companyService= companyService;
    }

    @GetMapping
    public ResponseEntity<List<CompanyEntity>> getAllCompanies() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.companyService.findAll());
    }
}
