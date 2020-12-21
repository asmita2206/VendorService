package com.springboot.vendors.exception;

public class NoRecordFoundException extends RuntimeException {

    public NoRecordFoundException(String message) {
        super(message);
    }
}
