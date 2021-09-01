package com.example.sprintRestExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sprintRestExample.entity.Greeting;
import com.example.sprintRestExample.exception.UserNotFondException;
import com.example.sprintRestExample.service.EmployeeService;
import com.example.sprintRestExample.service.EmployeeServiceImp;


@RestController
public class HelloController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping("/hello")
	public ResponseEntity<String> sayHello() {
		System.out.println("1");
		String message=null;
		message= employeeService.sayHello();
		System.out.println("2");
		ResponseEntity<String> entity=new ResponseEntity<String>("success",HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping("/hi")
	public String sayHi() {
		return "hi";
	}
	

	@RequestMapping("/public")
	public String sayPublic() {
		return "free access";
	}
	
	@RequestMapping("/greeting")
	public Greeting greeting() {
		Greeting greeting=Greeting.builder().message("Welcome to Spring Rest World").build();
		return greeting;
	}
	
	

}
