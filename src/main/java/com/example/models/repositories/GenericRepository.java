package com.example.models.repositories;

import com.example.models.documents.Generic;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface GenericRepository extends ReactiveMongoRepository<Generic, String> {
    @Query("{uuid :?0}")
    public Mono<Generic> findDistinctByUuid(String id);
}