package com.infosys.project.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infosys.project.user.dto.LoginDTO;
import com.infosys.project.user.service.CustomerService;


	@RestController
	@CrossOrigin
	public class CustomerController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	CustomerService service;
	

	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String Customerlogin(@RequestBody LoginDTO loginDTO) {
		logger.info("Login request for customer {} with password {}", loginDTO.getEmail(),loginDTO.getPassword());
		System.out.println("abc");
		if(service.customerlogin(loginDTO)) {
			return "Logged in successfully!";
		}
		return "Incorrect emailid or password!";
	
	}}
