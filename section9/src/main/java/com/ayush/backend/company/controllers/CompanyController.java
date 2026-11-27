package com.ayush.backend.company.controllers;

import com.ayush.backend.company.dtos.CompanyRequestDto;
import com.ayush.backend.company.dtos.CompanyResponseDto;
import com.ayush.backend.company.services.ICompanyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@RequiredArgsConstructor
public class CompanyController {
    private final ICompanyService companyService;

    @GetMapping(path = "/public")
    public ResponseEntity<List<CompanyResponseDto>> getAllCompanies() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.companyService.findAll());
    }

    @PostMapping
    public ResponseEntity<String> saveCompany(@RequestBody @Valid CompanyRequestDto companyRequestDto) {
        boolean isCompanySaved= this.companyService.saveCompany(companyRequestDto);

        if (!isCompanySaved) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to save the company");
        }

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Successfully saved the company");
    }
}
