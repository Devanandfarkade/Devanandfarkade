package com.project.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.project.dao.CustomerDao;
import com.project.entity.Customer;

class getcustomerTest {

	@Test
	public void customer() {
		List<Customer> customerList = new ArrayList<>();
		try (CustomerDao customerDao = new CustomerDao()){
			customerDao.getAllCustomer(customerList);
			for (Customer customer : customerList) {
				System.out.println(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	
	

}
