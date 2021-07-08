package com.example.configs.handler.errors;

import java.util.Map;

public class ForbiddenException extends BaseException {
    private static final String DESCRIPTION = "Forbidden Exception";

    public ForbiddenException(String detail) {
        super(DESCRIPTION +" . " +detail);
    }

    public ForbiddenException(String detail, Map<String, Object> variables) {
        super(DESCRIPTION +" . " +detail, variables);    }

    public ForbiddenException(String detail, Map<String, Object> variables, String path) {
        super(DESCRIPTION +" . " +detail, variables, path);
    }

    public ForbiddenException(String detail, String path) {
        super(DESCRIPTION +" . " +detail, path);
    }

}
