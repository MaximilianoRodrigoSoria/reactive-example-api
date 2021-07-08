package com.example.models.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class GenericDTO {
    private String name;
    private String description;
    private LocalDateTime createAt;

}
