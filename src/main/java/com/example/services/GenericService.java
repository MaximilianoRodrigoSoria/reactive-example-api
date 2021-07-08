package com.example.services;

import com.example.configs.handler.errors.BadRequestException;
import com.example.models.dtos.GenericDTO;
import com.example.models.mapers.GenericMapper;
import com.example.models.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GenericService {

    private GenericRepository repository;

    @Autowired
    public GenericService(GenericRepository repository)
    {
        this.repository = repository;
    }

    public Mono<GenericDTO> save(GenericDTO dto){
           return  Mono.just(dto)
                   .map(GenericMapper.INSTANCE::genericDTOToGeneric)
                   .flatMap(repository::save)
                   .map(GenericMapper.INSTANCE::genericToGenericDto)
                   .onErrorResume(e -> Mono.error(new BadRequestException("Error al salvar","/api/v1/save")));

    }
}
