package com.ayush.backendapplication.controllers;

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

    @GetMapping("/{id}")
    public String getOneUser(@PathVariable Long id) {
        return "Getting one user by id " + id;
    }
}
