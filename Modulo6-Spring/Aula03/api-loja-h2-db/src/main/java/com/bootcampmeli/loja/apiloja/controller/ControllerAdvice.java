package com.bootcampmeli.loja.apiloja.controller;

import com.bootcampmeli.loja.apiloja.dtos.ExceptionDTO;
import com.bootcampmeli.loja.apiloja.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<?> handlerException(ResponseStatusException ex){
        return new ResponseEntity<>(ex.getReason(), ex.getStatus());
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionDTO> handlerResponseStatusException(RuntimeException ex){
        return new ResponseEntity<ExceptionDTO>(new ExceptionDTO(ex.getMessage()), HttpStatus.NOT_FOUND);
    }
}
