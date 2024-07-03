package com.example.vendor.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Employee {
	private String name;
	private String designation;
	private String ctc;
	private String email;
	
}
