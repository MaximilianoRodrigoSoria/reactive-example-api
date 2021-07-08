package com.example.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class GenericResponse {

    @JsonProperty(value = "id")
    private UUID uuid;
    @JsonProperty(required = true)
    private String name;
    @JsonProperty(required = true)
    private String description;
    private LocalDateTime createAt;

}
