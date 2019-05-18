package com.example.utils.exp;

public class AppException extends Exception {

    public AppException(String status, String message) {
        this.status = status;
        this.message = message;
    }

    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
