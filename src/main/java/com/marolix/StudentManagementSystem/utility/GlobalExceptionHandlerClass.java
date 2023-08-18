package com.marolix.StudentManagementSystem.utility;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlerClass {

	@ExceptionHandler(StudentManagementException.class)
	public String methodToHandleStudentManagementException(Exception e) {
		return e.getMessage();
	}

	@ExceptionHandler(NullPointerException.class)
	public String methodToHandleNPE() {
		return "npe occured";
	}

	@ExceptionHandler(Exception.class)
	public String generalException() {
		return "general exception occured";
	}
}
