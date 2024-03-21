package com.main.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerOperationController
{
	 @GetMapping("/getCustomerData")
	 public ResponseEntity<Customer> getCustomerDetails()
	 {
		 Customer cust = new Customer();
		 cust.setCno(10001);
		 cust.setCname("Sukanta");
		 cust.setCaddr("Bhadrak");
		 cust.setCname("I-Exceed");
		 cust.setCmobno(9437778908l);
		 
		 return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	 }
}
