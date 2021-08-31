package com.example.sprintRestExample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sprintRestExample.entity.Employee;
import com.example.sprintRestExample.entity.ResponseModel;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity getEmployees(){
		Employee e= Employee.builder().name("ramesh")
								      .id(1001)
								      .salary(3453533.45f).build();
		List <Employee>employees=new ArrayList<Employee>();
		employees.add(e);
		// status 200 
		// employees
	
		
		ResponseEntity responseEntity=ResponseEntity
								.status(HttpStatus.OK)
								.header("testheaderkey", "testvalue")
								.body(employees);
		
		return responseEntity;
	
	}

	
	@RequestMapping("/{id}")
	public Employee getEmployee(@PathVariable int id){
		Employee e= Employee.builder().name("ramesh")
								      .id(id)
								      .salary(3453533.45f).build();
		return e;
	}
	
	
	
	/*ResponseModel response=ResponseModel.builder().payload(employees)
	  .status(HttpStatus.OK) 	
	  .build();*/
	@RequestMapping("/search/salary/{salary}/name/{name}")
	public Employee getEmployee(@PathVariable float salary, @PathVariable String name){
		Employee e= Employee.builder().name(name)
								      .id(1001)
								      .salary(salary).build();
		return e;
	}
	
	@RequestMapping("/param")
	public Employee getEmployeeparam(@RequestParam float salary, @RequestParam String name){
		Employee e= Employee.builder().name(name)
								      .id(1001)
								      .salary(salary).build();
		return e;
	}
	
	@PostMapping
	public Employee insertEmployee(@RequestBody Employee e){
		e.setName("newEmloyee ");
		return e;
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee e){
		e.setName("Suresh");
		return e;
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable int id){
		return "successfully delete";
	}
	
	
}
