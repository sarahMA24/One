package com.kfh.training.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.kfh.training.exception.AdminNotFoundException;


public class AdminExceptionController {
	@ExceptionHandler(value=AdminNotFoundException.class)
	public ResponseEntity<Object> exception(AdminNotFoundException exception){
		return new ResponseEntity<>("Category not found",HttpStatus.NOT_FOUND);
	}
}
