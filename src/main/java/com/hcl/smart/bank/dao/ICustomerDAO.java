package com.hcl.smart.bank.dao;

import com.hcl.smart.bank.entity.Customer;

public interface ICustomerDAO {

	Customer getCustomerById(int CustomerId);

}
