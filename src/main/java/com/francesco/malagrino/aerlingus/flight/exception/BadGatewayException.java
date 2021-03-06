package com.francesco.malagrino.aerlingus.flight.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class BadGatewayException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BadGatewayException(String message) {
        super(message);
    }
}