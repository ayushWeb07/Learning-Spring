package com.ayush.jobportal.dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ErrorResponseDto(String apiPath, HttpStatus httpCode, String errorMessage, LocalDateTime timestamp) {}