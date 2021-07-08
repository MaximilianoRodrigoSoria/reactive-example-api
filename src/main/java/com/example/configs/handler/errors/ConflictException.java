package com.example.configs.handler.errors;

import java.util.Map;

public class ConflictException extends RuntimeException {
    private static final String DESCRIPTION = "Conflict Exception ";
    private Map<String, Object> variables;
    private String message;

    public ConflictException(String detail) {
        this.message = DESCRIPTION + ". " + detail;
    }


    public ConflictException(String detail, Map<String, Object> variables) {
        this.variables = variables;
        this.message = DESCRIPTION + ". " + detail;

    }

    public Map<String, Object> getVariables() {
         return this.variables;
    }

    public String getMessage() {
        return this.message;
    }
}
