package com.shreebenakaspace.exception;

public class SongNotFoundException extends RuntimeException {
    public SongNotFoundException(String exception){
        super(exception);
    }
}
