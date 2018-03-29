package com.test.dao;

import java.util.List;

import com.test.domain.Customer;

public interface CustomerDao {

	public List<Customer> findAll();
}
