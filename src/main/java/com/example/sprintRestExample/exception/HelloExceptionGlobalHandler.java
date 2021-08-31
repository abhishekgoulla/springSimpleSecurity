package com.example.sprintRestExample.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HelloExceptionGlobalHandler {

	@ExceptionHandler(UserNotFondException.class)
	public ResponseEntity userException(HttpServletRequest req, Exception e) 
	{
		System.out.println("e");
		ResponseEntity<String> entity=new ResponseEntity<String>("errormessage", HttpStatus.BAD_REQUEST);
		return entity;
	}
	
	
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity employeeExceptionHandler1(HttpServletRequest req, Exception e) 
	{
		
		System.out.println(e);
		System.out.println("Runtime global handler");
		ResponseEntity entity=ResponseEntity.ok("hello");
		return entity;
	}
	
	@ExceptionHandler(Exception.class)
	public String employeeExceptionHandler12(HttpServletRequest req, Exception e) 
	{
		System.out.println(e);
		System.out.println("common global handler");
		return e.getMessage();
	}
	
	
}
