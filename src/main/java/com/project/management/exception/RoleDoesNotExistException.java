package com.project.management.exception;

public class RoleDoesNotExistException extends RuntimeException{
    public RoleDoesNotExistException(String message) {
        super(message);
    }
}
