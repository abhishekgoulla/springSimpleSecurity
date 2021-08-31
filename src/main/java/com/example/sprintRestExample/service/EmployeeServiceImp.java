package com.example.sprintRestExample.service;

import org.springframework.stereotype.Service;

import com.example.sprintRestExample.exception.UserNotFondException;

@Service
public class EmployeeServiceImp implements EmployeeService{

	
	public String sayHello() {
		System.out.println("3");
		if(true)
		throw new UserNotFondException("User is not available");
		return "hello";
	}
	
	
}
