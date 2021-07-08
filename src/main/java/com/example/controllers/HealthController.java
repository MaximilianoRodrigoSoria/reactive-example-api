package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HealthController {

    public final static String STATUS = "Alive";
    public final static String HEALTH ="/health";

    @GetMapping(HEALTH)
    public String health(){
        return STATUS;
    }

}
