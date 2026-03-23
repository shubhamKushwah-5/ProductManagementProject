package com.shubham.ProductManager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(com.shubham.ProductManager.exception.ProductNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleProductNotFoundException(com.shubham.ProductManager.exception.ProductNotFoundException ex){
        Map<String,Object> errorResponse = new HashMap<>();
        errorResponse.put("timeStamp", LocalDateTime.now());
        errorResponse.put("message",ex.getMessage());
        errorResponse.put("status", HttpStatus.NOT_FOUND.value());

        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }
}
