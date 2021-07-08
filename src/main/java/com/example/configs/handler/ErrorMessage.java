package com.example.configs.handler;

import com.example.configs.handler.errors.BaseException;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@Getter
@ToString
class ErrorMessage {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String error;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Integer code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private  String path;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String,Object> variables;

    ErrorMessage(Exception exception, Integer code) {
        this.error = exception.getClass().getSimpleName();
        this.message = exception.getMessage();
        this.code = code;
    }

    ErrorMessage(BaseException exception, Integer code, Map<String,Object> variables, String message) {
        this.error = exception.getClass().getSimpleName();
        this.message = message;
        this.code = code;
        this.variables = variables;

    }

    ErrorMessage(BaseException exception, Integer code, Map<String,Object> variables, String message, String path) {
        this.error = exception.getClass().getSimpleName();
        this.message = message;
        this.code = code;
        this.variables = variables;
        this.path = path;
    }

    ErrorMessage(BaseException exception, Integer code, String message, String path) {
        this.error = exception.getClass().getSimpleName();
        this.message = message;
        this.code = code;
        this.path = path;
    }
}
