package com.project.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.project.dao.CustomerDao;
import com.project.entity.Customer;

public class CustomerService {
	
	
	//display all Customers
	public static void getAllCustomer() {
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
