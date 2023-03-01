package com.ott.exception;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

public class APIError {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private HttpStatus status;
    private String message;
    private List errors;

    public APIError(){

    }

    public APIError(LocalDateTime timestamp,HttpStatus status,String message,List details){
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
        this.errors = details;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List getErrors() {
        return errors;
    }

    public void setErrors(List errors) {
        this.errors = errors;
    }
}
