package com.ayush.backend.job.services;

import com.ayush.backend.job.dtos.JobRequestDto;
import com.ayush.backend.job.dtos.JobResponseDto;

import java.util.List;

public interface IJobService {
    boolean saveJob(JobRequestDto jobRequestDto);
    List<JobResponseDto> findAll();
}
