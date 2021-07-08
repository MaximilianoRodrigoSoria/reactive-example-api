package com.example.controllers;

import com.example.models.dtos.GenericRequest;
import com.example.models.dtos.GenericResponse;
import com.example.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/v1")
public class GenericController {

    private GenericService service;

    @Autowired
    public GenericController(GenericService service)
    {
        this.service=service;
    }

    @PostMapping("/generic")
    public Mono<GenericResponse> save(@RequestBody GenericRequest dto){
        return service.save(dto);
    }

    @GetMapping("/generic")
    public Flux<GenericResponse> getAll(){
        return service.findAll();
    }
}
