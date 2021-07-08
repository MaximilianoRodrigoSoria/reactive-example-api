package com.example.configs.handler.errors;

import java.util.Map;

public class NotFoundException extends BaseException {
    private static final String DESCRIPTION = "Not Found Exception";

    public NotFoundException(String detail) {
        super(DESCRIPTION +" . " +detail);
    }

    public NotFoundException(String detail, Map<String, Object> variables) {
        super(DESCRIPTION +" . " +detail, variables);    }

    public NotFoundException(String detail, Map<String, Object> variables, String path) {
        super(DESCRIPTION +" . " +detail, variables, path);
    }

    public NotFoundException(String detail, String path) {
        super(DESCRIPTION +" . " +detail, path);
    }

}
