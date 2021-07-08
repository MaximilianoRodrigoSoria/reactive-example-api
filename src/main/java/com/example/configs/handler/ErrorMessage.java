package com.example.configs.handler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@Getter
@ToString
class ErrorMessage {

    private final String error;
    private final String message;
    private final Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String,Object> variables;

    ErrorMessage(Exception exception, Integer code) {
        this.error = exception.getClass().getSimpleName();
        this.message = exception.getMessage();
        this.code = code;
    }

    ErrorMessage(Exception exception, Integer code, Map<String,Object> variables, String message) {
        this.error = exception.getClass().getSimpleName();
        this.message = message;
        this.code = code;
        this.variables = variables;
    }

}
