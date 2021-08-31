package com.example.sprintRestExample.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Data
public class Greeting {

	private String message;
	
}
