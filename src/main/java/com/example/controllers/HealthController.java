package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HealthController {

    public final String STATUS = "Alive";

    @GetMapping("/health")
    public String health(){
        return STATUS;
    }
}
