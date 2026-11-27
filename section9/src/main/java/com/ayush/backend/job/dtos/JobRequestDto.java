package com.ayush.backend.job.dtos;

import com.ayush.backend.job.enums.JobStatus;
import com.ayush.backend.job.enums.WorkType;
import jakarta.validation.constraints.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

/**
 * DTO for {@link com.ayush.backend.job.entities.JobEntity}
 */
public record JobRequestDto(
        @NotNull(message = "Company id is required")
        UUID companyId,

        @NotBlank(message = "Title is required")
        @Size(min = 5, max = 255, message = "Title must be 5-255 characters")
        String title,

        @NotBlank(message = "Location is required")
        @Size(min = 5, max = 300, message = "Location must be 5-300 characters")
        String location,

        @NotNull(message = "Work type is required")
        WorkType workType,

        @NotBlank(message = "Experience level is required")
        @Size(min = 3, max = 50, message = "Experience level must be 3-50 characters")
        String experienceLevel,

        @NotNull(message = "Min salary is required")
        @Min(value = 1, message = "Min salary must be atleast 1.0")
        BigDecimal minSalary,

        @NotNull(message = "Max salary is required")
        @Min(value = 1, message = "Max salary must be atleast 1.0")
        BigDecimal maxSalary,

        @NotBlank(message = "Description is required")
        @Size(min = 200, max = 2500, message = "Description must be 200-2500 characters")
        String description,

        @NotBlank(message = "Requirements is required")
        @Size(min = 200, max = 2500, message = "Requirements must be 200-2500 characters")
        String requirements,

        @NotNull(message = "Posted date is required")
        Instant postedDate,

        @NotNull(message = "Application deadline is required")
        Instant applicationDeadline,

        @NotNull(message = "Applications count is required")
        Long applicationsCount,

        @NotNull(message = "Job status is required")
        JobStatus jobStatus
) implements Serializable {
}