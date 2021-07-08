package com.example.configs.handler.errors;

import java.util.Map;

public class BadRequestException extends BaseException {
    private static final String DESCRIPTION = "Bad Request Exception";

    public BadRequestException(String detail) {
        super(DESCRIPTION +" . " +detail);
    }

    public BadRequestException(String detail, Map<String, Object> variables) {
        super(DESCRIPTION +" . " +detail, variables);    }

    public BadRequestException(String detail, Map<String, Object> variables, String path) {
        super(DESCRIPTION +" . " +detail, variables, path);
    }

    public BadRequestException(String detail, String path) {
        super(DESCRIPTION +" . " +detail, path);
    }

}
