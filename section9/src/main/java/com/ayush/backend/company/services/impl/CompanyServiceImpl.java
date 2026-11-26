package com.ayush.backend.company.services.impl;

import com.ayush.backend.company.dtos.CompanyDto;
import com.ayush.backend.company.entities.CompanyEntity;
import com.ayush.backend.company.repositories.CompanyRepository;
import com.ayush.backend.company.services.ICompanyService;
import com.ayush.backend.job.dtos.JobDto;
import com.ayush.backend.job.entities.JobEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements ICompanyService {
    private final CompanyRepository companyRepository;

    @Override
    public List<CompanyDto> findAll() {
        List<CompanyEntity> companyEntities= this.companyRepository.findAll();

        return companyEntities
                .stream()
                .map(this::transformToDto)
                .collect(Collectors.toList());
    }

    private JobDto transformToJobDto(JobEntity jobEntity) {
        return new JobDto(
                jobEntity.getId(),
                jobEntity.getTitle(),
                jobEntity.getLocation(),
                jobEntity.getWorkType(),
                jobEntity.getExperienceLevel(),
                jobEntity.getMinSalary(),
                jobEntity.getMaxSalary(),
                jobEntity.getDescription(),
                jobEntity.getRequirements(),
                jobEntity.getPostedDate(),
                jobEntity.getApplicationDeadline(),
                jobEntity.getApplicationsCount(),
                jobEntity.getJobStatus(),
                jobEntity.getCreatedAt(),
                jobEntity.getCreatedBy(),
                jobEntity.getUpdatedAt(),
                jobEntity.getUpdatedBy()
        );
    }

    private CompanyDto transformToDto(CompanyEntity companyEntity) {
        List<JobEntity> jobs= companyEntity.getJobs();

        List<JobDto> jobsList= jobs
                .stream()
                .map(this::transformToJobDto)
                .collect(Collectors.toList());

        return new CompanyDto(companyEntity.getId(), companyEntity.getName(), companyEntity.getIndustry(), companyEntity.getNumEmployees(), companyEntity.getRating(), companyEntity.getDescription(), companyEntity.getWebsiteUrl(), jobsList, companyEntity.getCreatedAt(), companyEntity.getUpdatedAt());
    }
}
