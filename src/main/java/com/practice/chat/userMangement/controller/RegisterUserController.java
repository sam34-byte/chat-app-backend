package com.practice.chat.userMangement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterUserController {

    @PostMapping("/register")
    public ResponseEntity<String> register(){
        return ResponseEntity.ok("Hello World");
    }
}
