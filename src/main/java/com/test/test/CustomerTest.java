package com.test.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.CustomerDao;
import com.test.domain.Customer;



public class CustomerTest {

	@Test
	public void testFindALl() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
		CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
		List<Customer> list = customerDao.findAll();
		System.out.println(list);
	}
}
