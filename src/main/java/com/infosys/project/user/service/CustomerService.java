package com.infosys.project.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.project.user.dto.LoginDTO;
import com.infosys.project.user.entity.CustomerEntity;
import com.infosys.project.user.repository.CustomerRepository;
import com.infosys.project.user.validator.Validator;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository repo;

	public  boolean customerlogin(LoginDTO loginDTO) {
//		logger.info("Login request for customer {} with password {}", loginDTO.getEmail(), loginDTO.getPassword());
		
//		Validator.emailid(loginDTO.getEmail());
		CustomerEntity cust = repo.findByEmail(loginDTO.getEmail());
		System.out.println("service");
//		CustomerEntity cust1 = repo.findByPhonenumber(loginDTO.getPhonenumber());
		if(cust.getPassword().equals(loginDTO.getPassword())){
			return true;
//		}else if(cust1.getPhonenumber().equals(loginDTO.getPhonenumber())) {
//			return true;
		}else {
			return false;
		}

			

		}

		
	}
