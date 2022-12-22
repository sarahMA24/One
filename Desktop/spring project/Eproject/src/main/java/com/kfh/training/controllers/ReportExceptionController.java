package com.kfh.training.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.kfh.training.exception.ReportNotFoundException;

public class ReportExceptionController {
	@ExceptionHandler (value=ReportNotFoundException.class)
	public ResponseEntity<Object> exception(ReportNotFoundException exception){
		return new ResponseEntity<>("Report not found",HttpStatus.NOT_FOUND);
	}
}
