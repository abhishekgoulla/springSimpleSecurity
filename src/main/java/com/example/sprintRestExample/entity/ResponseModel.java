package com.example.sprintRestExample.entity;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseModel {

	private HttpStatus status;
	private Object payload;
	private String timestamp;
	private String message;
}
