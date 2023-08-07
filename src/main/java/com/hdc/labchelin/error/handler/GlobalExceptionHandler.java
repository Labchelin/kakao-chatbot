package com.hdc.labchelin.error.handler;

import com.hdc.labchelin.error.exception.PlaceException;
import com.hdc.labchelin.error.response.GlobalErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(PlaceException.class)
    protected ResponseEntity<GlobalErrorResponse> handleAuthExceptionHandler(PlaceException exception) {
        return ResponseEntity
                .status(exception.getErrorCode().getStatusCode())
                .body(GlobalErrorResponse.from(exception.getErrorCode().getErrorMessage()));
    }
}
