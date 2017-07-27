package com.hcl.smart.bank.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.smart.bank.entity.Customer;

@Transactional
@Repository
public class CustomerDAO implements ICustomerDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Customer getCustomerById(int customerId) {
		return entityManager.find(Customer.class, customerId);
	}
}