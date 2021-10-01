package com.torryharris.exceptionpack;

public class InsufficientLeaveException extends Exception{
    private String msg;

    public InsufficientLeaveException(String msg){
        this.msg=msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
