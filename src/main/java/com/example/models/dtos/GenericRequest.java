package com.example.models.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class GenericRequest {

    private String name;
    private String description;

}
