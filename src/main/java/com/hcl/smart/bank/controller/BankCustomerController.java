package com.hcl.smart.bank.controller;
/**
 * 
 */

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.smart.bank.entity.Customer;
import com.hcl.smart.bank.service.ICustomerService;
import com.hcl.swagger.smart.bank.customer.model.BankCustomerRequest;
import com.hcl.swagger.smart.bank.customer.model.BankCustomerResponse;

/**
 * @author pushpeswar.r
 *
 */
@RestController
@RequestMapping(value = "${app.context.path}")
public class BankCustomerController {

	@Autowired
	private ICustomerService customerService;

	@RequestMapping(value = "/login", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public ResponseEntity<Customer> verifyLogin(@RequestBody Customer request) {
		BankCustomerResponse response = new BankCustomerResponse();

		Customer customer = customerService.getCustomerById(12345);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);

	}

	
	
	
	
	@RequestMapping(value = "/loginWithCORS", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<BankCustomerResponse> searchEmployee(@RequestBody String pEmployeeId) {
		BankCustomerResponse response = new BankCustomerResponse();

		HttpHeaders header = new HttpHeaders();
		header.add("X-Requested-With", "X-Requested-With");
		header.add("Content-Type", "application/json");
		header.add("Cache-Control", "no-cache");
		header.setAccessControlAllowCredentials(true);
		header.setAccessControlAllowOrigin("*");
		List<HttpMethod> httpMethod = new ArrayList<>();
		httpMethod.add(HttpMethod.POST);
		httpMethod.add(HttpMethod.GET);
		httpMethod.add(HttpMethod.OPTIONS);
		httpMethod.add(HttpMethod.PUT);
		httpMethod.add(HttpMethod.HEAD);
		httpMethod.add(HttpMethod.TRACE);
		header.setAccessControlAllowMethods(httpMethod);

		return new ResponseEntity<>(response, header, HttpStatus.OK);
	}
}