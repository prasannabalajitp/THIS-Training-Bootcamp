package com.torryharris.exceptionpack;

public class InvalidAgeException extends Exception {
    private String msg;

    public InvalidAgeException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
