package com.example.configs.handler.errors;

import java.util.Map;

public class BaseException extends RuntimeException {
    private static final String DESCRIPTION = "Conflict Exception ";
    private Map<String, Object> variables;
    private String message;

    public BaseException(String detail) {
        this.message = DESCRIPTION + ". " + detail;
    }

    public BaseException(String detail, Map<String, Object> variables) {
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
