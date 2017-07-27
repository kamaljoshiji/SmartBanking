package com.hcl.smart.bank.service;

import com.hcl.smart.bank.entity.Customer;

public interface ICustomerService {

	Customer getCustomerById(int customerId);
	
	/*
	 * List<Customer> getAllCustomers();
	 * 
	 * boolean addCustomer(Customer customer);
	 * 
	 * void updateCustomer(Customer customer);
	 * 
	 * void deleteCustomer(int customerId);
	 */
}