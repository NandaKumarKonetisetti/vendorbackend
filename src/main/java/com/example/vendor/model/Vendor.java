package com.example.vendor.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Vendor {
	
	
	private String name;
	private String email;
	private String upi;
	


}
