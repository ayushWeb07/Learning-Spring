package com.ayush.backend.dtos;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ErrorResponseDto(String apiPath, String message, HttpStatus httpStatus, LocalDateTime timestamp) {
}
