package com.project.management.controller.advice;
import com.project.management.dto.GlobalExceptionDto;
import com.project.management.exception.RoleDoesNotExistException;
import com.project.management.exception.UserAlreadyExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    public RestResponseEntityExceptionHandler() {
        super();
    }

    @ExceptionHandler({ UserAlreadyExistException.class})
    public ResponseEntity<GlobalExceptionDto> handleUserAlreadyExistException(final UserAlreadyExistException e) {
        GlobalExceptionDto exceptionDto = new GlobalExceptionDto();
        exceptionDto.setResultCode("500");
        exceptionDto.setReason(e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionDto);
    }

    @ExceptionHandler({ RoleDoesNotExistException.class})
    public ResponseEntity<GlobalExceptionDto> handleRoleDoesNotExistException(final RoleDoesNotExistException e) {
        GlobalExceptionDto exceptionDto = new GlobalExceptionDto();
        exceptionDto.setResultCode("500");
        exceptionDto.setReason(e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionDto);
    }

}