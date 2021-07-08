package com.example.configs.handler.errors;

import java.util.Map;


public class ConflictException extends BaseException {
    private static final String DESCRIPTION = "Conflict Exception ";


    public ConflictException(String detail) {
        super(DESCRIPTION +" . " +detail);
    }

    public ConflictException(String detail, Map<String, Object> variables) {
        super(DESCRIPTION +" . " +detail, variables);    }

    public ConflictException(String detail, Map<String, Object> variables, String path) {
        super(DESCRIPTION +" . " +detail, variables, path);
    }

    public ConflictException(String detail, String path) {
        super(DESCRIPTION +" . " +detail, path);
    }
}
