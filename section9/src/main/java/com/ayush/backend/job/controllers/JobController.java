package com.ayush.backend.job.controllers;

import com.ayush.backend.job.dtos.JobRequestDto;
import com.ayush.backend.job.dtos.JobResponseDto;
import com.ayush.backend.job.services.IJobService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
@RequiredArgsConstructor
public class JobController {
    private final IJobService jobService;

    @GetMapping
    public ResponseEntity<List<JobResponseDto>> getAllJobs() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.jobService.findAll());
    }

    @PostMapping
    public ResponseEntity<String> saveJob(@RequestBody @Valid JobRequestDto jobRequestDto) {
        boolean isJobSaved= this.jobService.saveJob(jobRequestDto);

        if (!isJobSaved) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to save the job");
        }

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Successfully saved the job");
    }
}
