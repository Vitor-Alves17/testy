package com.example.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/gety")
    public ResponseEntity<?> sla(){
        return ResponseEntity.ok("Slay");
    }
}
