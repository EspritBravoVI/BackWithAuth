package com.esprit.devpi.controller;


import com.esprit.devpi.entities.CustomUser;
import com.esprit.devpi.service.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customUsers")
public class CustomUserController {

    private final CustomUserService customUserService;

    @Autowired
    public CustomUserController(CustomUserService customUserService) {
        this.customUserService = customUserService;
    }

    @PostMapping
    public ResponseEntity<CustomUser> createCustomUser(@RequestBody CustomUser customUser) {
        CustomUser createdCustomUser = customUserService.saveCustomUser(customUser);
        return new ResponseEntity<>(createdCustomUser, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomUser> getCustomUserById(@PathVariable Long id) {
        CustomUser customUser = customUserService.getCustomUserById(id);
        if (customUser != null) {
            return new ResponseEntity<>(customUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<CustomUser>> getAllCustomUsers() {
        List<CustomUser> customUsers = customUserService.getAllCustomUsers();
        return new ResponseEntity<>(customUsers, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomUser(@PathVariable Long id) {
        customUserService.deleteCustomUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
