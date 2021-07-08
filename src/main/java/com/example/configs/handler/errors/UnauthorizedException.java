package com.example.configs.handler.errors;

import java.util.Map;

public class UnauthorizedException extends BaseException {
    private static final String DESCRIPTION = "Unauthorized Exception - 401";

    public UnauthorizedException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

    public UnauthorizedException(String detail, Map<String, Object> variables) {
        super(DESCRIPTION +" . " +detail, variables);    }

    public UnauthorizedException(String detail, Map<String, Object> variables, String path) {
        super(DESCRIPTION +" . " +detail, variables, path);
    }

    public UnauthorizedException(String detail, String path) {
        super(DESCRIPTION +" . " +detail, path);
    }

}
