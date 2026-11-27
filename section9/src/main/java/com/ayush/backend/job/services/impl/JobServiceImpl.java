package com.ayush.backend.job.services.impl;

import com.ayush.backend.company.entities.CompanyEntity;
import com.ayush.backend.company.repositories.CompanyRepository;
import com.ayush.backend.job.dtos.JobRequestDto;
import com.ayush.backend.job.dtos.JobResponseDto;
import com.ayush.backend.job.entities.JobEntity;
import com.ayush.backend.job.repositories.JobRepository;
import com.ayush.backend.job.services.IJobService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements IJobService {
    private final JobRepository jobRepository;
    private final CompanyRepository companyRepository;

    @Override
    public boolean saveJob(JobRequestDto jobRequestDto) {
        CompanyEntity companyEntity = this.companyRepository.findById(jobRequestDto.companyId())
                .orElseThrow(() -> new EntityNotFoundException(String.format("Company not found with id: %s", jobRequestDto.companyId())));

        JobEntity jobEntity= this.transformJobRequestDtoToEntity(jobRequestDto);
        companyEntity.addJob(jobEntity);

        JobEntity savedJobEntity= this.jobRepository.save(jobEntity);
        return savedJobEntity.getId() != null;
    }

    @Override
    public List<JobResponseDto> findAll() {
        List<JobEntity> jobEntities = this.jobRepository.findAll();

        return jobEntities
                .stream()
                .map(this::transformEntityToResponseDto)
                .collect(Collectors.toList());
    }

    private JobEntity transformJobRequestDtoToEntity(JobRequestDto jobRequestDto) {
        JobEntity jobEntity= new JobEntity();
        BeanUtils.copyProperties(jobRequestDto, jobEntity);

        return jobEntity;
    }

    private JobResponseDto transformEntityToResponseDto(JobEntity jobEntity) {
        return new JobResponseDto(
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
}
