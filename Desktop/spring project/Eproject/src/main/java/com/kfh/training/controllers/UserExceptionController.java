package com.kfh.training.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.kfh.training.exception.UserNotFoundException;

@ControllerAdvice
public class UserExceptionController {
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<Object> exception(UserNotFoundException exception){
		return new ResponseEntity<>("User not found",HttpStatus.NOT_FOUND);
	}
	
	
}
