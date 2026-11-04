package com.ayush.backendapplication.controllers;

import com.ayush.backendapplication.dtos.UserDto;
import org.apache.catalina.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    @GetMapping
    public String getUsers() {
        return "Get all the users";
    }

    @GetMapping("/{userId}/posts/{postId}")
    public String getOnePostOfUser(@PathVariable(name = "userId") Long authorId, @PathVariable Long postId) {
        return "Post of id- " + postId + " by author with id- " + authorId;
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

    @PostMapping("/requestEntity")
    public String createUserWithRequestEntity(RequestEntity<UserDto> requestEntity) {
        HttpHeaders headers= requestEntity.getHeaders();
        UserDto body= requestEntity.getBody();
        return body.toString() + headers.toString();
    }
}
