package com.example.workspace.resources.exception;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.workspace.services.exception.DatabaseException;
import com.example.workspace.services.exception.ResourceNotFoundException;

@ControllerAdvice	
public class ResourceExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err  = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler
	public ResponseEntity<StandardError> databaseNotFound(DatabaseException e, HttpServletRequest request) {
		String error = "Database exception";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err  = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}

}
