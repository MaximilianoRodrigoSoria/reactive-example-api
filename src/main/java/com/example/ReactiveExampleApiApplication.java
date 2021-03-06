package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class ReactiveExampleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveExampleApiApplication.class, args);
    }

}
