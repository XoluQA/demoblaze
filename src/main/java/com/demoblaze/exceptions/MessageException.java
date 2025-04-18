package com.demoblaze.exceptions;

public class MessageException extends Error{

    public MessageException(String message, Throwable throwable){
        super(message,throwable);
    }
}
