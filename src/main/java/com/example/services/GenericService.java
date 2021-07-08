package com.example.services;

import com.example.configs.handler.errors.BadRequestException;
import com.example.configs.handler.errors.NotFoundException;
import com.example.models.dtos.GenericRequest;
import com.example.models.dtos.GenericResponse;
import com.example.models.mapers.GenericMapper;
import com.example.models.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GenericService {

    private GenericRepository repository;

    @Autowired
    public GenericService(GenericRepository repository)
    {
        this.repository = repository;
    }

    public Mono<GenericResponse> save(GenericRequest request){
        return  Mono.just(request)
                .map(this::validateRequest)
                .map(GenericMapper.INSTANCE::genericRequestToGeneric)
                .flatMap(repository::save)
                .map(GenericMapper.INSTANCE::genericToGenericResponse);
    }

    public Flux<GenericResponse> findAll()    {
        return repository.findAll()
                .map(GenericMapper.INSTANCE::genericToGenericResponse)
                .onErrorResume(e -> Mono.error(new BadRequestException("Error al buscar todos","/api/v1/generic")));
    }

    public GenericRequest validateRequest(GenericRequest request){
        if(request.getName()== null || request.getDescription()== null || request.getName().isBlank() || request.getDescription().isBlank())
        {
            throw new NotFoundException("Description and name cannot be empty");
        }
        return request;
    }
}
