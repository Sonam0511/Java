package org.example.exception;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//custom exception class ResourceNotFoundException for handling situations
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
