package com.webModule.webService.exception;

import java.lang.reflect.InvocationTargetException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExeptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)  
    @ExceptionHandler(value = Throwable.class)  
	public ResponseEntity<?> handleNoSuchElementFoundException(Throwable e) {
        final ErrorResponse errorResponse = new ErrorResponse(e);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
	
}
