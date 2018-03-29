package com.test.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.test.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public List<Customer> findAll() {
		
		return (List<Customer>) this.getHibernateTemplate().find("from Customer");
	}

}
