package com.ayush.backend.controllers;

import com.ayush.backend.dtos.UserRequestDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    @GetMapping
    public ResponseEntity<String> getAllUsers() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Getting all the users...");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getUserById(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(String.format("Getting the user by id: %d...", id));
    }

    @GetMapping("/search")
    public ResponseEntity<String> searchUser(@RequestParam String name, @RequestParam(required = false) String sex) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(String.format("Searching the user by name: %s | sex: %s", name, sex));
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserRequestDto userRequestDto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(String.format("Creating the user with name: %s | sex: %s | age: %d", userRequestDto.name(), userRequestDto.sex(), userRequestDto.age()));
    }

    @PostMapping("/with-request-entity")
    public ResponseEntity<String> createUserWithRequestEntity(RequestEntity<UserRequestDto> requestEntity) {
        HttpHeaders httpHeaders= requestEntity.getHeaders();
        UserRequestDto userRequestDto= requestEntity.getBody();
        String path= requestEntity.getUrl().getPath();
        String query= requestEntity.getUrl().getQuery();

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(String.format("Creating the user with request entity: headers -> %s | body -> %s | path -> %s | query -> %s", httpHeaders.toString(), userRequestDto.toString(), path, query));
    }
}
