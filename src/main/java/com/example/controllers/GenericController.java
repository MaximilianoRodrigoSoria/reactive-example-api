package com.example.controllers;

import com.example.models.dtos.GenericDTO;
import com.example.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    public Mono<GenericDTO> save(@RequestBody GenericDTO dto){
        return service.save(dto);
    }
}
