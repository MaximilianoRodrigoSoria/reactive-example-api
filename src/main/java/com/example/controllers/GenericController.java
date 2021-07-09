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

    @GetMapping("/generic/{id}")
    public Mono<GenericResponse> findId(@PathVariable String id){
        return service.findById(id);
    }

    @DeleteMapping("/generic/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return service.delete(id);
    }
}
