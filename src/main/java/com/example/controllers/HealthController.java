package com.example.controllers;

import com.example.configs.handler.errors.ConflictException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class HealthController {

    public final static String STATUS = "Alive";
    public final static String HEALTH ="/health";


    @GetMapping(HEALTH)
    public String health(){
        return STATUS;
    }
    @GetMapping(HEALTH+"2")
    public String health2(){
        if(true){
            Map<String,Object> variables = new HashMap<>();
            variables.put("lala", "pwpw");
            throw  new ConflictException("mensaje", variables);
        }
        return STATUS;
    }
}
