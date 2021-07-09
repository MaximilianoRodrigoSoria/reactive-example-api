package com.example.configs.handler;

import com.example.configs.handler.errors.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApiExceptionHandler {

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler({
            UnauthorizedException.class,
    })
    @ResponseBody
    public void unauthorizedRequest() {
        //Empty. Nothing to do
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({
            NotFoundException.class
    })
    @ResponseBody
    public ErrorMessage notFoundRequest(BaseException exception) {
        return new ErrorMessage(exception, HttpStatus.NOT_FOUND.value(),exception.getVariables(), exception.getMessage(), exception.getPath() );
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({
            BadRequestException.class,
            org.springframework.web.bind.support.WebExchangeBindException.class,
            org.springframework.http.converter.HttpMessageNotReadableException.class,
            org.springframework.web.server.ServerWebInputException.class
    })
    @ResponseBody
    public ErrorMessage badRequest(BaseException exception) {
        return new ErrorMessage(exception, HttpStatus.BAD_REQUEST.value(),exception.getVariables(), exception.getMessage(), exception.getPath() );
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler({
            ConflictException.class
    })
    @ResponseBody
    public ErrorMessage conflict(BaseException exception) {
        return new ErrorMessage(exception, HttpStatus.CONFLICT.value(), exception.getVariables(), exception.getMessage(), exception.getPath() );
    }



    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler({
            ForbiddenException.class
    })
    @ResponseBody
    public ErrorMessage forbidden(BaseException exception) {
        return new ErrorMessage(exception, HttpStatus.FORBIDDEN.value(),exception.getVariables(), exception.getMessage(), exception.getPath() );
    }

    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    @ExceptionHandler({
            BadGatewayException.class
    })
    @ResponseBody
    public ErrorMessage badGateway(BaseException exception) {
        return new ErrorMessage(exception, HttpStatus.BAD_GATEWAY.value(),exception.getVariables(), exception.getMessage(), exception.getPath() );
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({
            Exception.class
    })
    @ResponseBody
    public ErrorMessage exception(Exception exception) {
        exception.printStackTrace();
        return new ErrorMessage(exception, HttpStatus.INTERNAL_SERVER_ERROR.value());
    }

}
