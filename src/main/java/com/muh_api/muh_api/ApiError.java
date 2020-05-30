package com.muh_api.muh_api;

public class ApiError {
    private int status;
    private String message;
    public ApiError(int status,String message){
        this.message=message;
        this.status=status;

    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
