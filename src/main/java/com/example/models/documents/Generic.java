package com.example.models.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Document(collection = "generic")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@Getter
@Setter
public class Generic implements Serializable {

    private static final long serialVersionUID = -5824709982771246183L;
    @Id
    private String id;

    private UUID uuid;

    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("create_at")
    private LocalDateTime createAt;


    public Generic() {
        this.uuid = UUID.randomUUID();
        this.createAt = LocalDateTime.now();
    }

}