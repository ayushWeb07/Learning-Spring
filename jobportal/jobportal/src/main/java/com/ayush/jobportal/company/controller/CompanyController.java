package com.ayush.jobportal.company.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v{version}/companies")
public class CompanyController {
    @GetMapping(version = "1.0")
    public ResponseEntity<String> getAllCompanies() {
        return ResponseEntity.status(HttpStatus.OK).body("Fetch all the companies v1");
    }

    @GetMapping(version = "2.0")
    public ResponseEntity<String> getAllCompaniesV2() {
        return ResponseEntity.status(HttpStatus.OK).body("Fetch all the companies v2");
    }
}
