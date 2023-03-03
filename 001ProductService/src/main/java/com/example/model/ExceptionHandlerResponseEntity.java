package com.example.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ExceptionHandlerResponseEntity extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(ProductServiceCustumException.class)
    public ResponseEntity<ErrorResponse> handleProductServiceException(ProductServiceCustumException exception) {
        return new ResponseEntity<>(new ErrorResponse().builder()
                .ErrorMessage(exception.getMessage())
                .ErrorCode(exception.getErrorCode())
                .build(), HttpStatus.NOT_FOUND);

}
}