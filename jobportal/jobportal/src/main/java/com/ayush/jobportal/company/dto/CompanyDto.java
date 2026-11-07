package com.ayush.jobportal.company.dto;

import java.math.BigDecimal;

public record CompanyDto(Long id, String name, String industry, Integer numEmployees, BigDecimal rating, String location, String description, String websiteUrl) {
}
