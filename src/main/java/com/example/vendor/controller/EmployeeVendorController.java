package com.example.vendor.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.vendor.model.Employee;
import com.example.vendor.model.Vendor;
import com.example.vendor.service.EmployeeService;
import com.example.vendor.service.VendorService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class EmployeeVendorController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@Autowired
	private VendorService vendorService;

	
	
	@RequestMapping(value = "/api/check",method = RequestMethod.GET)
	public ResponseEntity<String> getData() {
		log.info("response sent successffully");
	
		return ResponseEntity.ok("Successfull");
	}
	
	@RequestMapping(value="/api/save/vendor",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Map<String, String>> createVendor(@RequestBody com.example.vendor.model.Vendor vendor){
		
	log.info("name : "+vendor.getName() + " email : "+vendor.getEmail() + " upi "+ vendor.getUpi());
		
	return ResponseEntity.ok().body(Map.of("message","Successfully Saved Employee Data"));
		
		
	}
	
	@RequestMapping(value="/api/save/employee",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Map<String, String>> createEmployee(@RequestBody com.example.vendor.model.Employee employee){
		log.info("name : "+employee.getName()+" email :  "+ employee.getEmail() + " designation : "+employee.getDesignation()+"   ctc : "+employee.getCtc());
		
		
		return ResponseEntity.ok().body(Map.of("message","Successfully Saved Employee Data"));
	}
	
	@RequestMapping(value="/api/get/vendors",method = RequestMethod.GET)
	@ResponseBody
	public Collection<Vendor> getVendors() {
		log.info("Called all vendor service");
		return  vendorService.getAllVendors();
		
		
	}
	
	@RequestMapping(value="/api/get/employees",method = RequestMethod.GET)
	public Collection<Employee> getEmployees(){
		
		return employeeService.getAllEmployees();
		
		
	}
	
	@RequestMapping(value = "/api/send/mails",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Map<String, String>> sendEmail(@RequestBody List<Vendor> vendors){
		log.info("Sending mails to vendors");
		
		return ResponseEntity.ok().body(Map.of("message","Successfully Sent mails"));
		
	}
	
}
