package com.example.configs.handler.errors;

import java.util.Map;

public class BadGatewayException extends BaseException {
    private static final String DESCRIPTION = "Bad Gateway Exception";

    public BadGatewayException(String detail) {
        super(DESCRIPTION +" . " +detail);
    }

    public BadGatewayException(String detail, Map<String, Object> variables) {
        super(DESCRIPTION +" . " +detail, variables);    }

    public BadGatewayException(String detail, Map<String, Object> variables, String path) {
        super(DESCRIPTION +" . " +detail, variables, path);
    }

    public BadGatewayException(String detail, String path) {
        super(DESCRIPTION +" . " +detail, path);
    }



}
