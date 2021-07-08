package com.example.models.repositories;

import com.example.models.documents.Generic;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericDocument extends ReactiveMongoRepository<String, Generic> {
}
