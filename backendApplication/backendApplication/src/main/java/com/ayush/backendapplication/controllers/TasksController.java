package com.ayush.backendapplication.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v{version}/tasks")
public class TasksController {
    @GetMapping(version = "1")
    public ResponseEntity<String> getTasksV1() {
        return ResponseEntity.status(HttpStatus.OK).body(String.format("Fetching the tasks by version- %d", 1));
    }

    @GetMapping(version = "2")
    public ResponseEntity<String> getTasksV2() {
        return ResponseEntity.status(HttpStatus.OK).body(String.format("Fetching the tasks by version- %d", 2));
    }
}
