package com.ayush.jobportal.company.controller;

import com.ayush.jobportal.company.entity.Company;
import com.ayush.jobportal.company.service.ICompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v{version}/companies")
public class CompanyController {
    private final ICompanyService companyService;

    public CompanyController(ICompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping(version = "1.0")
    public ResponseEntity<List<Company>> getAllCompanies() {
        return ResponseEntity.status(HttpStatus.OK).body(this.companyService.findAll());
    }

    @GetMapping(version = "2.0")
    public ResponseEntity<String> getAllCompaniesV2() {
        return ResponseEntity.status(HttpStatus.OK).body("Fetch all the companies v2");
    }
}
