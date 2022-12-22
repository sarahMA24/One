package com.kfh.training.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.kfh.training.exception.CategoryNotFoundException;
import com.kfh.training.exception.UserNotFoundException;
@ControllerAdvice
public class CategoryExceptionController {
	@ExceptionHandler(value=CategoryNotFoundException.class)
	public ResponseEntity<Object> exception(CategoryNotFoundException exception){
		return new ResponseEntity<>("Category not found",HttpStatus.NOT_FOUND);
	}
}
