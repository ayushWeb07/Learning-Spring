package com.ayush.backendapplication.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
