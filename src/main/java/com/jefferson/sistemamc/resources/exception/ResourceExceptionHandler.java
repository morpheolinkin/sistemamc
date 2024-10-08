package com.jefferson.sistemamc.resources.exception;

import com.jefferson.sistemamc.services.exceptions.ObjectNotFoundException;
import com.jefferson.sistemamc.util.DateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e){
        StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), DateTime.getCurrentDateTimeInMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
}
