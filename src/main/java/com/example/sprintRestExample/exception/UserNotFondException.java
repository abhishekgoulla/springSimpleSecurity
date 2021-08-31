package com.example.sprintRestExample.exception;

// checked exception and unchecked Exception 
public class UserNotFondException extends RuntimeException{

	
	public UserNotFondException(String message) {
		super(message);
	}
}
