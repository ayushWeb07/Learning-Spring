package com.ayush.backendapplication.controllers;

import com.ayush.backendapplication.dtos.UserDto;
import org.apache.catalina.User;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    @GetMapping
    public ResponseEntity<String> getUsers() {
        return ResponseEntity.status(HttpStatus.OK).body("Get all the users");
    }

    @GetMapping("/{userId}/posts/{postId}")
    public ResponseEntity<String> getOnePostOfUser(@PathVariable(name = "userId") Long authorId, @PathVariable Long postId) {
        return ResponseEntity.status(HttpStatus.OK).body(String.format("Post of id- %s by author with id- %s", postId, authorId));
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getOneUser(@PathVariable Long id) {
        return String.format("{\"message\": \"Getting one user by id\", \"id\": %d}", id);
    }

    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public String search(@RequestParam String firstName, @RequestParam String sex) {
        return String.format("{\"message\": \"Searching user by name and sex\", \"firstName\": \"%s\", \"sex\": \"%s\"}", firstName, sex);
    }

    @GetMapping(value = "/headers", produces = MediaType.APPLICATION_JSON_VALUE)
    public String readHeaders(@RequestHeader("User-Agent") String userAgent, @RequestHeader("Accept") String accept, @RequestHeader(name = "User-Hobby", required = false, defaultValue = "Gymming") String userHobby) {
        return String.format("{\"message\": \"Fetching all the request headers\", \"userAgent\": \"%s\", \"accept\": \"%s\", \"userHobby\": \"%s\"}", userAgent, accept, userHobby);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String createUser(@RequestBody UserDto userDto) {
        return String.format("{\"message\": \"Creating a user\", \"name\": \"%s\", \"age\": \"%d\", \"ig\": \"%s\", \"dc\": \"%s\"}", userDto.name(), userDto.age(), userDto.ig_id(), userDto.dc_id());
    }

    @PostMapping(value = "/requestEntity", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createUserWithRequestEntity(RequestEntity<UserDto> requestEntity) {
        HttpHeaders headers= requestEntity.getHeaders();
        UserDto body= requestEntity.getBody();
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("My-Hobby", "Gymming")
                .body(String.format("{\"message\": \"Creating user with req and res entity\", \"body\": \"%s\", \"headers\": \"%s\"}", body.toString(), headers.get("User-Agent")));
    }
}
