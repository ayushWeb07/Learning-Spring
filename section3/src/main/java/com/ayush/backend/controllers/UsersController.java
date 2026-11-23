package com.ayush.backend.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    @GetMapping
    public String getAllUsers() {
        return "Getting all the users...";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        return String.format("Getting the user by id: %d...", id);
    }

    @GetMapping("/search")
    public String searchUser(@RequestParam String name, @RequestParam(required = false) String sex) {
        return String.format("Searching the user by name: %s | sex: %s", name, sex);
    }
}
