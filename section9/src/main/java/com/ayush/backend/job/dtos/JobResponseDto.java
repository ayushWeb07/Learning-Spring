package com.ayush.backend.job.dtos;

import com.ayush.backend.company.dtos.CompanyResponseDto;
import com.ayush.backend.company.entities.CompanyEntity;
import com.ayush.backend.job.enums.JobStatus;
import com.ayush.backend.job.enums.WorkType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

/**
 * DTO for {@link com.ayush.backend.job.entities.JobEntity}
 */
public record JobResponseDto(
        UUID id,
        CompanyResponseDto company,
        String title,
        String location,
        WorkType workType,
        String experienceLevel,
        BigDecimal minSalary,
        BigDecimal maxSalary,
        String description,
        String requirements,
        Instant postedDate,
        Instant applicationDeadline,
        Long applicationsCount,
        JobStatus jobStatus,
        Instant createdAt,
        String createdBy,
        Instant updatedAt,
        String updatedBy) implements Serializable {
}